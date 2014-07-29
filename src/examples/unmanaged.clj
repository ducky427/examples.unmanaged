(ns examples.unmanaged
  (:import (java.nio.charset Charset)
           (javax.ws.rs Path PathParam Produces GET)
           (javax.ws.rs.core Context Response)))


(defn make-dummy
  [node-id]
  (str "Hello World" ", nodeId=" node-id))


(definterface HelloWorld
  (hello [^org.neo4j.graphdb.GraphDatabaseService database ^long node-id]))


(deftype ^{Path "/helloworld"} HelloWorldResource []
  HelloWorld
  (^{GET true
     Produces ["text/plain"]
     Path "/{nodeId}"}
    hello
    [this ^{Context true} database ^{PathParam "nodeId"} node-id]
      (require 'examples.unmanaged)
      (let  [result  (-> (make-dummy node-id)
                         (.getBytes (Charset/forName "UTF-8")))]
        (-> (Response/ok)
            (.entity result)
            .build))))
