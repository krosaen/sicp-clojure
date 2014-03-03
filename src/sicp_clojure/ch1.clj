(ns sicp-clojure.ch1)

;;; Exercise 1.2 - fully within test

;;; Exercise 1.3
;;; http://mitpress.mit.edu/sicp/full-text/book/book-Z-H-10.html#%_thm_1.3
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
;;; http://mitpress.mit.edu/sicp/full-text/book/book-Z-H-10.html#%_thm_1.6
(defn new-if [pred then-clause else-clause]
  (cond pred then-clause
    :else else-clause)
  )

;;; Exercise 1.7
;;; http://mitpress.mit.edu/sicp/full-text/book/book-Z-H-10.html#%_thm_1.7
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

(defn good-enough-v2? [guess prev-guess]
  (<
    (Math/abs
       (- guess prev-guess))
    (* 0.001 guess)))

(defn sqrt-iter-v2 [guess prev-guess x]
  (if (good-enough? guess prev-guess)
    guess
    (recur (improve guess x) guess x)))

(defn sqrt-v2 [x] (sqrt-iter-v2 1.0 0.0 x))

;;; Exercise 1.8
;;; http://mitpress.mit.edu/sicp/full-text/book/book-Z-H-10.html#%_thm_1.8
(declare cubert-iter)
(declare good-enough-cubert?)
(declare improve-cubert)
(declare average)

(defn cubert [x] (cubert-iter 1.0 x))

(defn cubert-iter [guess x]
  (if (good-enough-cubert? guess x)
    guess
    (recur (improve-cubert guess x) x)))

(defn good-enough-cubert? [guess x]
  (< (Math/abs (- (* guess guess guess) x)) 0.001))

(defn improve-cubert [guess x]
  (/
    (+
      (/ x (* guess guess))
      (* 2 guess)
      )
    3))

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

