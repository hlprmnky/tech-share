(ns tech-share.core-test
  (:use midje.sweet)
  (:use [tech-share.core]))


(facts "about `fizz-buzz`"
  (fact "it returns the string-ification of a number when passed a number"
        (= "1" (fizz-buzz 1)) => true)
  (fact "it returns 'fizz' when pass a number divisible by 3"
        (= "fizz" (fizz-buzz 6)) => true)
  (fact "it returns 'buzz' when passed a number divisible by 5"
        (= "buzz" (fizz-buzz 20)) => true)
  (fact "it returns 'fizzbuzz' when passed a number divisible by 15"
        (= "fizzbuzz" (fizz-buzz 30)) => true))