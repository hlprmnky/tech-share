(ns tech-share.core-test
  (:use midje.sweet)
  (:use [tech-share.core]))

(facts "About 'fizz-buzz'"
       (fact "It returns a number passed in as an argument"
             (= 1 (fizz-buzz 1)) => true)
       (fact "It returns 'fizz' when the argument is divisible by 3"
             (= "fizz" (fizz-buzz 6)) => true)
       (fact "It returns 'buzz' when the argument is divisible by 5"
             (= "buzz" (fizz-buzz 20)) => true)
       (fact "It returns 'fizzubzz' when the argument is divisible by 15"
             (= "fizzbuzz" (fizz-buzz 30)) => true))