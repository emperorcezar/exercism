(ns word-count)
(require '[clojure.string :as str])

(defn word-count [sentence]
  (let [cleaned-sentence (clojure.string/replace (str/lower-case sentence) #"[^a-zA-Z0-9 ]" "")
        word-collection (str/split cleaned-sentence #" ")]
    (into {} (filter #(not= (first %) "") (frequencies word-collection))))
  )