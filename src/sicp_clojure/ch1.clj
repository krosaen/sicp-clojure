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

;;; local bindings to hide helper methods, share local x
(defn sqrt-internals [x]
  (let [average (fn [a b]
                  (/ (+ a b) 2))
        abs (fn [a]
              (if (< a 0) (* -1 a) a))
        good-enough? (fn [guess]
                       (<
                         (abs (- (* guess guess) x))
                         0.001))
        improve (fn [guess] (average guess (/ x guess)))
        sqrt-iter (fn [guess]
                    (if (good-enough? guess)
                      guess
                      (recur (improve guess))
                      ))]
    (sqrt-iter 1.0)))


;;; Exercise 1.11
;;; http://mitpress.mit.edu/sicp/full-text/book/book-Z-H-11.html#%_thm_1.11
(defn fib3 [n]
  (if
    (< n 3) n
    (+
      (fib3 (- n 1))
      (* 2 (fib3 (- n 2)))
      (* 3 (fib3 (- n 3)))
      )
    ))


(defn fib3-iter [n]
  (let [
    impl (fn [i j k cnt]
           (if (= cnt 0)
             k
             (recur
               j
               k
               (+ k (* 2 j) (* 3 i) )
               (- cnt 1)
               )))
         ]
    (impl 0 1 2 (- n 2))
    )
  )

;;; Exercise 1.12
;;; http://mitpress.mit.edu/sicp/full-text/book/book-Z-H-11.html#%_thm_1.12
(defn pascal [n]
  (let [
    pair-add (fn [s]
               (map
                 (fn [args] (apply + args))
                 (partition 2 1 s)
                 )
               )
         ]
    (if (<= n 1)
      [1]
      (concat
        [1]
        (pair-add (pascal (- n 1)))
        [1])
      )))

;;; Exercise 1.16
; not fully iterative
(defn fast-expt [b n]
  (cond
    (= n 0) 1
    (even? n) (recur (* b b) (/ n 2))
    :else (* b (fast-expt b (- n 1)))
    )
  )
; fully iterative
(defn fast-expt-iter [b n]
  (let [inner (fn [a b n]
                (cond
                  (= n 0) a
                  (even? n) (recur a (* b b) (/ n 2))
                  :else (recur (* a b) b (- n 1))))
        ]
    (inner 1 b n)))
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

