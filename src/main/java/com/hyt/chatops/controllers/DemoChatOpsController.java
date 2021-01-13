package com.hyt.chatops.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dennis.Chen
 * @Date 2020/01/13
 */
@RestController
@RequestMapping("/demo")
public class DemoChatOpsController {

    private static Logger log = LogManager.getLogger(DemoChatOpsController.class);

    @RequestMapping("/getTestMessage")
    public Map<String, String> getTestMessage(){
        log.info("Start getTestMessage");

        Map<String, String> result = new HashMap<>();
        result.put("message", "Demo Test Message");
        log.info("End getTestMessage");

        return result;
    }
}
