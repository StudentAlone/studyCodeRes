package com.laoyin.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: laoyin
 */
@Component
public class KafkaProducer {
    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;

    public String send(@RequestParam String msg){
        kafkaTemplate.send("springboottopic", msg);
        return "ok";
    }
}
