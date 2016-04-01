 (ns phone-number)

 (defn number [n]
   (let [numbers (apply str (re-seq #"\d+" n))
         c (count numbers)]
     (cond
       (= c 10) numbers
       (and (= c 11) (= \1 (first numbers))) (apply str (rest numbers))
       :else "0000000000")))

 (defn area-code [n]
   (let [cleaned-number (number n)]
     (apply str (take 3 cleaned-number))))

 (defn pretty-print [n]
   (let [cleaned-number (apply vector (number n))
         area-code (apply str (subvec cleaned-number 0 3))
         local-code (apply str (subvec cleaned-number 3 6))
         number (apply str (subvec cleaned-number 6 10))]
     (str \( area-code ") " local-code \- number)))