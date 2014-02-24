(ns sicp-clojure.ch1-test
  (:require [clojure.test :refer :all ]
            [sicp-clojure.ch1 :refer :all ]))

(testing "Exercise 1.2"
  (is (=
        -37/150
        (/ (+ 5 4 (- 2 (- 3 (+ 6 (/ 4 5)))))
          (* 3 (- 6 2) (- 2 7)))
        )))
