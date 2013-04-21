(ns slicna.core)

(defmacro invoke "Call func from lib" [lib func ret & args] 
  `(let [library#  (name ~lib)
         function# (com.sun.jna.Function/getFunction library# ~func)] 
     (.invoke function# ~ret (to-array [~@args]))))

