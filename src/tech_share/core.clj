(ns tech-share.core
  (:gen-class)
  (:import (java.util UUID)))

(defn fizz-buzz
  "Implements the FizzBuzz algorithm"
  [number]

  (println "Attempt GUID: " (UUID/randomUUID))

  (condp = 0
    (mod number 15) "fizzbuzz"
    (mod number 3) "fizz"
    (mod number 5) "buzz"
    number))


(defn -main
  "Runs fizz-buzz over the numbers from 1 to 100"
  [& args]
  (doall (map (fn [x] (println (fizz-buzz x))) (range 1 101))))