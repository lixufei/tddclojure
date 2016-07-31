(ns tddclojure.core)

(defoperation :fetch []
              (print "fetch")
              )

(defn -main
  "I don't do a whole lot...yet."
  [& args]
  (operation :fetch))



;(defn get-accounts [opportunities]
;  (->> opportunities
;       (map :account)
;       (distinct)
;       (sort)
;       )
;  )
;
;(defn get-revenue-table [salary]
;  (--> salary
;       (map (fn [item]
;            (map (fn [i] (merge i {:region (:region item)})) (:revenue item))
;                 ))
;    )
;  )

