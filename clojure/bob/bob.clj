 (ns bob)

 (defn yelling? [sentence]
   (and (= (clojure.string/upper-case sentence) sentence) (some? (re-find #"[A-Z]+" sentence))))

 (defn response-for [sentence]
   (let [punctuation (last sentence)]
     (cond
       (clojure.string/blank? sentence) "Fine. Be that way!"
       (yelling? sentence) "Whoa, chill out!"
       (= punctuation \?) "Sure."
       :else "Whatever.")))


