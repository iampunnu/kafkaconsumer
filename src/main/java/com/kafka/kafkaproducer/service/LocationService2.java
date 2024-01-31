package com.kafka.kafkaproducer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service

public class LocationService2 {
    @KafkaListener(topics = "cab-location",groupId = "group1")
    public void cablocation(Map<String,String> stringStringMap){
        stringStringMap.forEach((k,v)-> System.out.println(k+v));
    }
}
