package com.brightmeta.KafkaTests

import java.util.Properties

import org.apache.kafka.clients.producer.{KafkaProducer, ProducerRecord}

/**
  * Created by John on 11/10/17.
  */
class BasicProducer(properties: Properties, topicName: String) {
  val props = properties
  val topic = topicName
  val producer = new KafkaProducer[String, String](props)

  def send(msg: String): Unit = {
    val record = new ProducerRecord[String, String](topic, msg)
    producer.send(record)
    producer.close()
  }

}
