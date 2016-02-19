 (ns beer-song
   (:require [clojure.string :refer [capitalize join]]))

 (defn get-bottle-str [i]
   (cond
     (= i 0) "no more bottles"
     (= i 1) "1 bottle"
     :else (str i " bottles")))

 (defn get-take-str [i]
   (if (> i 0)
     (str "Take "
          (if (> i 1) "one" "it")
          " down and pass it around")
     "Go to the store and buy some more"
     ))

 (defn verse [i]
   (str (capitalize (get-bottle-str i)) " of beer on the wall, " (get-bottle-str i) " of beer.\n"
        (get-take-str i) ", " (get-bottle-str (if (> i 0) (- i 1) 99))
        " of beer on the wall.\n"))

 (defn sing
   ([a]
    (sing a 0))
   ([a b]
    (join "\n" (map #(str (verse %)) (reverse (range b (+ a 1)))))))
