(ns hallofmirrors.core
  (:use hallofmirrors.io)
  )

(import java.lang.Math)

(defn get-points 
  " Calculates all the possible intersection values for a single axis,
	given the initial position, the size of the room along this axis
	and the maximum distance.
	
	    xf = nw + (w - x0) sen² (n · pi/2) + x0 cos² (n · pi/2)

	The integer variable n has an upper limit in (/ d w)."
  [x0 w d] 
  (let [limit (int (+ 1 (/ d w)))]
	  (map 
	    #(if (even? (int %))
	          (+ (* % w) x0)
	          (+ (* % w) (- w x0))
	        )
	    (range (- limit) limit)) 
    )
  )

(defn get-reflections 
  " Get all the reflections from the given point in a room of
  the given dimensions. The output is a set of pairs [tg(alfa) boolean]
  where alfa is the angle from the x axis and the boolean indicates 
  whether the reflection is in front of or behind x. The special values
  :horizontal and :vertical are used to indicate 0 and infinity."
  
  [{d :d [h w] :dimensions [y0 x0] :x0}]
  (let [x-axis (get-points x0 w d)
        y-axis (get-points y0 h d)
        d-cuad (Math/pow d 2)
        ]
    
     (set (for [x x-axis 
	          y y-axis 
	          :when (<= (+ (Math/pow (- x x0) 2) (Math/pow (- y y0) 2)) d-cuad)
	          ]               
	      (cond
          (= x x0) [:vertical (>= (- y y0) 0)]
	        :else [(/ (- y y0) (- x x0)) (>= (- x x0) 0)]
          )
    )))
  )

(defn get-kata-results []
  (let [tests (load-dataset "D-small-practice.in")]
    (apply str 
      (map #(str "Case #" (second %)": " (count (get-reflections (first %))) "\n")
	       (->> (range 1 (+ 1 (count tests))) (interleave tests) (partition 2))))   
    )
  )

(defn write-results []
  (spit "kata.out" (get-kata-results))
  )