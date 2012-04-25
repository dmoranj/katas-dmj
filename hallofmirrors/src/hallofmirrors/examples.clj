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