(ns sicp-clojure.ch1)

;;; Exercise 1.2 - fully within test

;;; Exercise 1.3
(defn sum-two-of-three [i1 i2 i3]
  (let [sqrboth (fn [a b] (+ (* a a) (* b b)))]
    (if (< i1 i2)
      (if (< i1 i3)
        (sqrboth i2 i3)
        (sqrboth i1 i2))
      (if (< i2 i3)
        (sqrboth i1 i3)
        (sqrboth i1 i2)))))

(defn sum-two-of-three-v2 [& args]
  (apply
    (fn [a b] (+ (* a a) (* b b)))
    (take 2 (sort #(< %2 %1) args))))

;;; Exercise 1.6
(defn new-if [pred then-clause else-clause]
  (cond pred then-clause
    :else else-clause)
  )

;;; Exercise 1.7
(declare sqrt-iter)
(declare good-enough?)
(declare improve)
(declare average)

(defn sqrt [x] (sqrt-iter 1.0 x))

(defn sqrt-iter [guess x]
  (if (good-enough? guess x)
    guess
    (recur (improve guess x) x)))

(defn good-enough? [guess x]
  (< (Math/abs (- (* guess guess) x)) 0.001))

(defn improve [guess x]
  (average guess (/ x guess)))

(defn average [x y]
  (/ (+ x y) 2))


;;; Exercise 1.7
;;; Exercise 1.8
;;; Exercise 1.11
;;; Exercise 1.12
;;; Exercise 1.16
;;; Exercise 1.17
;;; Exercise 1.18
;;; Exercise 1.19
;;; Exercise 1.22
;;; Exercise 1.23
;;; Exercise 1.27
;;; Exercise 1.28
;;; Exercise 1.29
;;; Exercise 1.30
;;; Exercise 1.31
;;; Exercise 1.32
;;; Exercise 1.33
;;; Exercise 1.34
;;; Exercise 1.35
;;; Exercise 1.36
;;; Exercise 1.37
;;; Exercise 1.38
;;; Exercise 1.39
;;; Exercise 1.40
;;; Exercise 1.41
;;; Exercise 1.42
;;; Exercise 1.43
;;; Exercise 1.44
;;; Exercise 1.46

