def tree_to_text(tree, root_node):
        queue = []
        finished_nodes = []
        queue.append(root_node)
        parent    = root_node
        leftChild = tree[root_node][0]
        result    = ""
        while(1):
            if len(tree[leftChild]) > 0:
                parent = leftChild
                leftChild = tree[parent][0]
            else:
                finished_nodes.append()
                result = result + leftChild.split("_")[1] + parent 




    

def main():
    graph = {"+": ["*",3], "*":[2,7], 2:[],7:[],3:[]}
    initial_node = "+"  
    graph2 = {0: [1,3], 1:[2,3], 2:[3,1], 3:[0,1]}
    initial_node2 = 0
    print(bfs_traversal(graph, initial_node))
    print("\n")
    print(bfs_traversal(graph2, initial_node2))
    print("\nDFS\n")
    print(dfs_traversal(graph, initial_node))
    print("\n")
    print(dfs_traversal(graph2, initial_node2))

# Main Execution

if __name__ == '__main__':
    main()