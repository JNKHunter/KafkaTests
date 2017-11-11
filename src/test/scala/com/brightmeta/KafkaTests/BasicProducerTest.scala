package com.brightmeta.KafkaTests

import java.util.Properties

import net.manub.embeddedkafka.EmbeddedKafka
import org.scalatest.{BeforeAndAfter, FlatSpec}

/**
  * Created by John on 11/10/17.
  */
class BasicProducerTest extends FlatSpec with EmbeddedKafka {

  val props = new Properties()

  props.put("bootstrap.servers", "localhost:6001")
  props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer")
  props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer")

  val basicProducer = new BasicProducer(props, "testtest")

  "Basic Producer" should "Send a message" in {

    withRunningKafka {
      basicProducer.send("Hello from basic test")
      assert(consumeFirstStringMessageFrom("testtest") === "Hello from basic test")
    }

  }
}
