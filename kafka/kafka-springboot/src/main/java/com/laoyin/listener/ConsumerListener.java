package com.laoyin.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author: laoyin
 */
@Component
public class ConsumerListener {
    @KafkaListener(topics = "springboottopic",groupId = "springboottopic-group")
    public void onMessage(String msg){
        System.out.println("----收到消息："+msg+"----");
    }
}
