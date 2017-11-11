package com.brightmeta.KafkaTests

import java.util.Properties

/**
  * Created by John on 11/10/17.
  */
object Application extends App{
  val props = new Properties()

  props.put("bootstrap.servers", "localhost:9092")
  props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer")
  props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer")

  val basicProducer = new BasicProducer(props, "testtest")
  basicProducer.send("Hello from basic producer")
}
