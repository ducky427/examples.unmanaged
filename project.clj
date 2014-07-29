(defproject examples.unmanaged "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :aot :all
  :omit-source true
  ;; Ignoring jars
  ;; https://groups.google.com/forum/#!topic/clojure/mSffcagZBQs
  :profiles {:provided {:dependencies [[org.neo4j/neo4j "2.1.3"]
                                       [org.neo4j/neo4j-kernel "2.1.3" :classifier "tests" :scope "test"]
                                       [javax.ws.rs/javax.ws.rs-api "2.0"]]}})
