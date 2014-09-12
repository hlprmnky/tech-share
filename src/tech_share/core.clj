(ns tech-share.core
  (:gen-class)
  (:import (java.util UUID)))

(defn fizz-buzz
  "Implementation of the FizzBuzz algorithm"
  [number]

  ;(println "Attempt GUID: " (UUID/randomUUID))

  (condp = 0
    (mod number 15) "fizzbuzz"
    (mod number 3) "fizz"
    (mod number 5) "buzz"
    (str number)))

(defn -main
  "Executes the FizzBuzz algorithm over values 1-100"
  [& _]
  (doall (map #(println (fizz-buzz %)) (range 1 101))))