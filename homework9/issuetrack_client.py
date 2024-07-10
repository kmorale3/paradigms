from requests.auth import HTTPBasicAuth
import requests
import csv

# Katie Morales
# Homework 9

''' need to write:
        total_bugs_per_package.csv
            containing the total number of bugs per package
        total_comments_per_bug.csv
            containing the total number of comments per bug id. '''


URL = "http://localhost:51074/"

bug_totals     = {}
comment_totals = {}

# parses the list of bugs
def parse_bugs(bugs, feature):	
    for b in bugs:
        f = b[feature]
        bug_totals[f] = bug_totals.get(f, 0) + 1 
	
def bug_csv(csv_writer):
    for p, r in bug_totals.items():
        csv_writer.writerow([p,r])


# parses the list of bugs
def parse_comments(comments, feature):	
    for c in comments:
        if feature == "bug":
            f = c["bug"].split("/")[-2]
        else:
            f = c[feature]
        comment_totals[f] = comment_totals.get(f, 0) + 1

def comment_csv(csv_writer):
    for p, r in comment_totals.items():
        csv_writer.writerow([p,r])




def visit_url(resource, feature, callbacka,callbackb):
	# open file
	with open(f"total_{resource}_per_{feature}.csv", "w", newline='', encoding="utf8") as csvfile:
		csv_writer = csv.writer(csvfile, delimiter=',',quotechar='"')
		csv_writer.writerow([feature, "total"])

		# composes request URL
		url = URL + resource
		# while the `next` page to visit is not None
		while url:
			# HTTP request without authentication
			response = requests.get(url)
			# parse the response to JSON
			json_resp = response.json()
			# get the next page
			url = json_resp["next"] 
			# parse the returned user information
			callbacka(json_resp["results"], feature)
		callbackb(csv_writer)

def main():
	visit_url("bugs", "package", parse_bugs, bug_csv)
	visit_url("comments","bug", parse_comments, comment_csv)
	


if __name__ == '__main__':
	main()