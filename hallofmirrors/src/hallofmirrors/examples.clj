(ns hallofmirrors.examples)

(def example-1
  ;Case #1: 4
  {:d 1, 
   :dimensions [1 1], 
   :space [[\# \# \#] 
           [\# \X \#]
           [\# \# \#]], 
   :x0 [0.5 0.5]})

(def example-2 
  ;Case #2: 8
  {:d 2, 
   :dimensions [1 1], 
   :space [[\# \# \#] 
           [\# \X \#]
           [\# \# \#]], 
   :x0 [0.5 0.5]})

(def example-3 
  ;Case #3: 68
  {:d 8, 
   :dimensions [2 1], 
   :space [[\# \# \#] 
           [\# \X \#] 
           [\# \. \#] 
           [\# \# \#]], 
   :x0 [0.5 0.5]})

(def example-4
  ;D-Simple Case #3: 32
  {:d 41, 
   :dimensions [16 8], 
   :space [[\# \# \# \# \# \# \# \# \# \#] 
           [\# \. \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \X \#] 
           [\# \. \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \. \#] 
           [\# \# \# \# \# \# \# \# \# \#]], 
   :x0 [4.5 7.5]}
)

(def example-5
  ;D-Simple Case #3: 3
  {:d 11, 
   :dimensions [14 26], 
   :space [[\# \# \# \# \# \# \# \# \# \# \# \# \# \# \# \# \# \# \# \# \# \# \# \# \# \# \# \#] 
           [\# \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \#] 
           [\# \X \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \#] 
           [\# \# \# \# \# \# \# \# \# \# \# \# \# \# \# \# \# \# \# \# \# \# \# \# \# \# \# \#]], 
   :x0 [11.5 0.5]}
  )

(def example-6
  ;D-Simple Case #15: 16
  {:d 47, 
   :dimensions [27 7], 
   :space [[\# \# \# \# \# \# \# \# \#] 
           [\# \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \X \#] 
           [\# \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \#] 
           [\# \. \. \. \. \. \. \. \#] 
           [\# \# \# \# \# \# \# \# \#]], 
   :x0 [1.5 6.5]}
  )