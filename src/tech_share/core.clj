(ns tech-share.core)

(defn fizz-buzz
  "Implements the FizzBuzz algorithm"
  [number]
  (condp = 0
    (mod number 15) "fizzbuzz"
    (mod number 3) "fizz"
    (mod number 5) "buzz"

    (str number)))
