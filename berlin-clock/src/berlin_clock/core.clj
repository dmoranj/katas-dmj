(ns berlin-clock.core)

(use 'clojure.core.logic)
(require '[clojure.core.logic.fd :as fd])

(defn current-time [h m s]
  (+ (* h 3600) (* m 60) s))

(defn berlin-reason [h m s]
  (let [seconds (current-time h m s)]
		(run* [q] 
		  (fresh [a s b c d e]
			  (fd/in s (fd/interval 0 59))
			  (fd/in b (fd/interval 0 4))
			  (fd/in c (fd/interval 0 4))
			  (fd/in d (fd/interval 0 11))
			  (fd/in e (fd/interval 0 4))
		    (fd/eq
		      (= (+ s (* b 18000) (* c 3600) (* d 300) (* e 60)) seconds))
	      (== q [s b c d e])))))

(defn alter-seconds [reasoning]
  (assoc reasoning 0 (-> reasoning (first) (unchecked-divide-int 2) (mod 2))))

(defn berlinize [[n max color]]
    (concat (replicate n color) (replicate (- max n) "O")))

(defn berlin-number [time]
    (map berlinize (partition 3 (interleave time [1 4 4 11 4] ["Y" "R" "R" "Y" "Y"]))))

(defn berlin-clock [h m s] 
  (berlin-number (alter-seconds (first (berlin-reason h m s)))))
