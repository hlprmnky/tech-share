(ns tech-share.core-test
  (:use midje.sweet)
  (:use [tech-share.core]))

(facts "About 'fizz-buzz'"
       (fact "It returns the string represntation of the argument"
             (= "1" (fizz-buzz 1)) => true)
       (fact "It returns 'fizz' when provided an argument divisble by 3"
             (= "fizz" (fizz-buzz 3)) => true)
       (fact "It returns 'buzz' when provided an argument divisible by 5"
             (= "buzz" (fizz-buzz 5)) => true)
       (fact "It returns 'fizzbuzz ..."
             (= "fizzbuzz" (fizz-buzz 45)) => true))
