; Katie Morales Homework 11 question 3

(require '[clojure.string :as str])

; read in temperatures from file
(def temps (slurp "./temperatures.txt"))
; split the string into an array based on new line chars
(def temps (str/split temps #"\n"))
; convert the array into doubles
(def tempF (map (fn [x] (Double/parseDouble x)) temps))
; convert the temperatures to celcius
(def tempC (map (fn [x] (* (/ 5 9.0) (- x 32))) tempF))
; average function
(defn avg [p] (double (/ (reduce + p)  (count p))))
; calculate and print the stats
(println "min = " (apply min tempC))
(println "max = " (apply max tempC))
(println "avg = " (avg tempC))