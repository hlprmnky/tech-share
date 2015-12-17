(ns tech-share.core-test
  (:use midje.sweet)
  (:use [tech-share.core]))

(facts "About 'fizz-buzz'"
       (fact "It returns the supplied argument"
             (= 1 (fizz-buzz 1)) => true))
