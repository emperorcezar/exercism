 (ns grade-school)

 (defn add [db student grade]
   (assoc db grade (conj (get db grade []) student)))

 (defn grade [db grade-number]
   (get db grade-number []))

(defn sorted [db]
  (let [map-sorted-values (for [[k v] db] [k (sort v)])]
    (into (sorted-map) map-sorted-values)))