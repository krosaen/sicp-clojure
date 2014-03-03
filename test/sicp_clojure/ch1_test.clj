(ns sicp-clojure.ch1-test
  (:require [clojure.test :refer :all]
            [sicp-clojure.ch1 :refer :all]))

(deftest ch1-test
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
  (testing "Exercise 1.7 example of where it works"
    (is (=
          2.0000000929222947
          (sqrt 4)))
    )
  (testing "Exercise 1.7 example of small numbers not working"
    (is (=
          0.031260655525445276
          (sqrt 0.000001)))
    )
  (testing "Exercise 1.7 improved good-enough so small numbers works"
    (is (=
          0.0010000001533016628
          (sqrt-v2 0.000001)))
    )
  (testing "Exercise 1.8"
    (is (=
          3.0000005410641766
          (cubert 27)))
    )
  )
