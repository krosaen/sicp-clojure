(ns sicp-clojure.ch1-test
  (:require [clojure.test :refer :all ]
            [sicp-clojure.ch1 :refer :all ]))

(testing "Exercise 1.2"
  (is (=
        -37/150
        (/ (+ 5 4 (- 2 (- 3 (+ 6 (/ 4 5)))))
          (* 3 (- 6 2) (- 2 7)))
        )))

(testing "Exercise 1.3"
  (is (=
        13
        (sum-two-of-three 1 2 3)
        (sum-two-of-three-v2 1 2 3)))
  (is (=
        13
        (sum-two-of-three 3 1 2)
        (sum-two-of-three-v2 1 2 3)))
  (is (=
        13
        (sum-two-of-three 1 3 2)
        (sum-two-of-three-v2 1 3 2)))
  )