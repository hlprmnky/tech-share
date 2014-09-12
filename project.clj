(defproject tech-share "0.0.1-SNAPSHOT"
  :description "Demo of FizzBuzz in Clojure for a TechShare talk"
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :profiles {:dev {:dependencies [[midje "1.6.3"]]}
             :uberjar {:aot [tech-share.core]}})
  
