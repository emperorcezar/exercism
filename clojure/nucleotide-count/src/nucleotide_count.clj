 (ns nucleotide-count)

 (def empty-nucleotide-map {\A 0, \T 0, \C 0, \G 0})

 (defn validate-nucleotide [l]
   (if-not (contains? empty-nucleotide-map l)
     (throw (Exception. "Invalid Nucleotide"))
     ))

 (defn build-frequency-map [string]
   (merge empty-nucleotide-map (frequencies string))
   )

 (defn count [letter string]
   (validate-nucleotide letter)
   (get (build-frequency-map string) letter))

 (defn nucleotide-counts [string]
   (build-frequency-map string))
