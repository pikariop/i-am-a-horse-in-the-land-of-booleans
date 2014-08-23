(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (= x false) false
     (if (= x nil) false true)
    )
  )

(defn abs [x]
  (if (< x 0) (- x) x )
  )

(defn divides? [divisor n]
  (if (= 0 (mod n divisor)) true false )
  )

(defn fizzbuzz [n]
  (if (= 0 (mod n 15)) "gotcha!"
    (if (= 0 (mod n 5)) "buzz"
      (if (= 0 (mod n 3)) "fizz"
        "")
      )
    )
  )

(defn teen? [age]
  (if (<= 13 age 19) true false )
 )

(defn not-teen? [age]
  ":(")

(defn generic-doublificate [x]
  ":(")

(defn leap-year? [year]
  ":(")

; '_______'
