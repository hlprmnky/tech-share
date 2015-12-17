(defproject tech-share "0.0.1-SNAPSHOT"
  :description "Demo of REPL-based development for LV meetup"
  :dependencies [[org.clojure/clojure "1.7.0"]]
  :profiles {:dev {:dependencies [[midje "1.8.2"]]}
             :uberjar {:aot [tech-share.core]}})
