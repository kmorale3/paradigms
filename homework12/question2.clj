; Katie Morales Homework 11 question 2

; Name space taxation
(ns taxation)        ; Going to work in this ns

; calculate the tax
(defn tax [amount percent] 
   (* amount (/ percent 100.0)))   

(ns application)    ; Switch to new namespace

(printf "7 percent tax on $117 = %.2f\n" (taxation/tax 117 7))