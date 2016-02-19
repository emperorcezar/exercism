(ns rna-transcription)

(defn is-valid? [letter]
  (contains? #{\G \C \T \A} letter))

(defn DNA->RNA [letter]
  (assert (is-valid? letter))
  (condp = letter
    \G \C
    \C \G
    \T \A
    \A \U))

(defn to-rna [dna-sequence]
  (apply str (map DNA->RNA (seq dna-sequence))))