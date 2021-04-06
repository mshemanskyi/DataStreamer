Locally before start:
1. start zookeeper
2. start broker
3. run console consumer


## Start the ZooKeeper service
./zookeeper-server-start.sh ../config/zookeeper.properties

## Start the Kafka broker service
$ ./kafka-server-start.sh ../config/server.properties

## Produce messages
./kafka-console-producer.sh --topic quickstart-events --bootstrap-server localhost:9092

## Consume messages
./kafka-console-consumer.sh --topic quickstart-events --from-beginning --bootstrap-server localhost:9092

## clean up

- Stop the producer and consumer clients with Ctrl-C, if you haven't done so already.
- Stop the Kafka broker with Ctrl-C.
- Lastly, stop the ZooKeeper server with Ctrl-C.

rm -rf /tmp/kafka-logs /tmp/zookeeper