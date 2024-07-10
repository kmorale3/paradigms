; Katie Morales Homework 11 question 1

; Use range and map to generate a sequence of 
;   square numbers for 1 to n (inclusive)
; use reduce to get the sum of the numbers

; get n from command line, add 1 to make sure it is inclusive in range
(def n (+ 1 (Integer/parseInt (first *command-line-args*))))
; make a list of the numbers 1 to n
(def mylist (range 1 n))
; make a new list of the squares of the original numbers 
(def newList (map (fn [x] (* x x)) mylist))
; print the values line-by-line 
(doseq [x newList] (prn x))
; generate the sum using reduce
(def result (reduce + newList) )
; print the sum
(printf "Sum = %d\n" result)