(ns hallofmirrors.io)

(defn find-x0 [space]
  (map #(- % 0.5) 
	  (first (for [x (range (count space)) y (range (count (first space)))
	        :when (= \X (-> space (nth x) (nth y)))
	        ]
	        [x y]
	      ))
    )
  )

(defn load-dataset [name]
  (let [test-cases (re-seq #"\d+ \d+ \d+\n#[#X\\.\s]+" (slurp name))]
    (map
      (fn create [tst]
         (let [data (vec (map 
                         #(Integer. (.trim %)) 
                         (.split (re-find #"\d+ \d+ \d+\n" tst) " ")))
               space (vec (map
                            #(vec %)
                            (.split (re-find #"#[#X\\.\s]+" tst) "\n")
                            ))
               ]
                 { :d (nth data 2) 
                   :dimensions (vec (map #(- % 2) (take 2 data)))
                   :space space
                   :x0 (find-x0 space)
                   }
                 )
         )
      test-cases
      )
    )
  )