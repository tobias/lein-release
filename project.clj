(defproject org.clojars.ato/lein-release "1.0.1"
  :description "Leiningen Release Plugin (ato's fork with concise tags and commit messages)."
  :dev-dependencies [[swank-clojure "1.4.2"]]
  :eval-in :leiningen
  :lein-release {:deploy-via :lein-install}
  :dependencies [[org.clojure/clojure "1.3.0"]])
