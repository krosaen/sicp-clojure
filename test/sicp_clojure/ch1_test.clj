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
  (testing "sqrt with internals within fn"
    (is (=
          2.0000000929222947
          (sqrt-internals 4)))
    )
  (testing "exersie 1.11"
    (is (=
          796
          (fib3 9)))
    (is (=
          25
          (fib3 5)))
    (is (=
          59
          (fib3 6)))
    )
  (testing "exersie 1.11 iter"
    (is (=
          25
          (fib3-iter 5)))
    (is (=
          796
          (fib3-iter 9))))
  (testing "exercise 1.12 pascal"
    (is (=
          [1]
          (pascal 1)))
    (is (=
          [1 1]
          (pascal 2)))
    (is (=
          [1 2 1]
          (pascal 3)))
    (is (=
          [1 3 3 1]
          (pascal 4)))
    (is (=
          [1 4 6 4 1]
          (pascal 5))))

  (testing "exercise 1.16"
    (is (=
          (fast-expt-iter 2 4)
          16))
    (is (=
          (fast-expt-iter 4 17)
          17179869184))
    )
  )
