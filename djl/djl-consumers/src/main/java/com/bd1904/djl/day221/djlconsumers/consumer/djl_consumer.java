package com.bd1904.djl.day221.djlconsumers.consumer;

import com.bd1904.djl.day221.djlconsumers.util.SaveDataUtil;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
@Component
public class djl_consumer {

    @KafkaListener(topics = "log221")
    public void onMessage(String message) throws Exception{
        SaveDataUtil.saveLog(message);
    }

}
