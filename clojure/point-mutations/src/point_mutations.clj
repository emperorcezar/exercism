 (ns point-mutations)

 (defn hamming-distance [a b]
   (if-not (= (count a) (count b))
     nil
     (reduce + (map #(if (= %1 %2) 0 1) (seq a) (seq b)))))
