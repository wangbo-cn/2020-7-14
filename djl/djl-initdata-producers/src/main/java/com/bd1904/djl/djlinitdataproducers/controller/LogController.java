package com.bd1904.djl.djlinitdataproducers.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.bd1904.djl.djlinitdataproducers.util.LogUtils;
import com.sun.org.apache.xpath.internal.SourceTree;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class LogController {
    //kafka的模板工具类
    @Resource
    private KafkaTemplate<String,String> kafkaTemplate;


    @RequestMapping("/log221")
    @ResponseBody
    public Map<String,String>  initLog(){
        List<String> list = LogUtils.getLogs();//获得1000条日志
        for (String log : list) {
            //将消息发送给kafka
            kafkaTemplate.send("log221",log);
//            System.out.println(log);
        }
        Map<String,String> map = new HashMap<>();
        map.put("message","ok");
        return map;
    }
}
