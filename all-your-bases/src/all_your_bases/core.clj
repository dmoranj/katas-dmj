(ns all-your-bases.core)

(defn exp [x n]
  (reduce * (repeat n x)))

(defn assign-values [message]
  (let [values (concat [1 0] (range 2 (count message)))
        code (zipmap (distinct message) values)
        interleaved (partition 2 (interleave message (range (-> message count dec) -1 -1)))]
    (reduce #(+ %1 (* (code (first %2)) (exp (count code) (second %2))) ) 0 interleaved)))


(defn readInput [name]
  (drop 1 (.split (slurp name) "\n")))

(defn writeOutput [name value]
  (spit name (reduce str (map #(str "Case #" (inc (first %)) ": " (second %) "\n") (partition 2 (interleave (range) value)))))
  )


(writeOutput "A-small-practice.out" (map assign-values (readInput "A-small-practice.in")))