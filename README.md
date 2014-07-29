# examples.unmanaged

An example Neo4j unmanaged extension written in Clojure.

## Usage

Edit the Makefile to point to your Neo4j installation. Then run:

    make

This will build the project and copy the jar to the plugins folder in neo4j.

Also put the following text in your neo4j `conf/neo4j-server.properties` file:

    org.neo4j.server.thirdparty_jaxrs_classes=examples.unmanaged=/examples/unmanaged

To test, run:

    curl http://localhost:7474/examples/unmanaged/helloworld/10

You should see:

    Hello World, nodeId=10

## License

Copyright © 2014 Rohit Aggarwal

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
