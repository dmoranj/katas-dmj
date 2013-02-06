(ns berlin-clock.core)

(use 'clojure.core.logic)
(require '[clojure.core.logic.fd :as fd])

(defn current-time [h m s]
  (+ (* h 3600) (* m 60) s)
  )

(defn berlin-reason [h m s]
  (let [seconds (current-time h m s)]
		(run* [q] 
		  (fresh [a s b c d e x y]
			  (fd/in s (fd/interval 0 59))
			  (fd/in b (fd/interval 0 4))
			  (fd/in c (fd/interval 0 4))
			  (fd/in d (fd/interval 0 11))
			  (fd/in e (fd/interval 0 4))
		    (fd/eq
		      (= (+ s (* b 18000) (* c 3600) (* d 300) (* e 60)) seconds)
		      )
	      (== q [s b c d e])))))

(defn berlinize [[n max]]
    (concat (replicate n "Y") (replicate (- max n) "O")))

(defn berlin-number [time]
    (drop 1 (map berlinize (partition 2 (interleave time [60 4 4 11 4])))))

(defn berlin-clock [h m s] 
  (berlin-number (first(berlin-reason h m s))))