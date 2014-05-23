(defproject org.clojars.tcrawley/lein-release "1.0.6-SNAPSHOT"
  :description "Leiningen Release Plugin (tcrawley's fork of ato's fork)"
  :url "https://github.com/ato/lein-release"
  :dev-dependencies [[swank-clojure "1.4.2"]]
  :eval-in :leiningen
  :lein-release {:deploy-via :clojars}
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [lein-set-version "0.4.1"]])
