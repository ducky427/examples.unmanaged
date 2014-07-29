.PHONY: jar

target: jar

jar:
	lein do clean, uberjar
	cp target/examples.unmanaged-0.1.0-SNAPSHOT-standalone.jar ~/bin/neo4j/latest/plugins
