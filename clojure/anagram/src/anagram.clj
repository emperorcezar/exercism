(ns anagram
  (:use [clojure.string :only [lower-case]]))


(defn is-anagram? [a b]
  (let [a (lower-case a)
        b (lower-case b)]
    (and
      (= (set a) (set b))
      (not (= a b))
      (= (frequencies a) (frequencies b)))))

(defn anagrams-for [word s]
  (filter (partial is-anagram? word) s))

