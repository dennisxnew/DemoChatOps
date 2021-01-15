package com.hyt.chatops.controllers;

import com.hyt.chatops.restful.ServerCard;
import com.hyt.chatops.uibeans.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    public Map<String, String> getTestMessage() {
        log.info("Start getTestMessage");

        Map<String, String> result = new HashMap<>();
        result.put("message", "Demo Test Message");
        log.info("End getTestMessage");

        return result;
    }

    @GetMapping("/getServerCards")
    public List<Map<String, String>> getServerCards() {
        List<Map<String,String>> result = new ArrayList<>();

        Map<String, String> serverCard1 = new HashMap<>();
        serverCard1.put("serverName", "Server1");
        serverCard1.put("cpuText","28");
        serverCard1.put("cpuImgUrl","http://localhost:8080/img/lc1.png");
        serverCard1.put("memoryText","85");
        serverCard1.put("memoryImgUrl","http://localhost:8080/img/lc2.png");
        serverCard1.put("storageText","61");
        serverCard1.put("storageImgUrl","http://localhost:8080/img/lc1.png");
        serverCard1.put("httpConnText","27");
        serverCard1.put("httpConnImgUrl","http://localhost:8080/img/bg1.png");
        serverCard1.put("dbConnText","15");
        serverCard1.put("dbConnIUrl","http://localhost:8080/img/bg1.png");
        result.add(serverCard1);

        Map<String, String> serverCard2 = new HashMap<>();
        serverCard2.put("serverName", "Server2");
        serverCard2.put("cpuText","47");
        serverCard2.put("cpuImgUrl","http://localhost:8080/img/lc1.png");
        serverCard2.put("memoryText","40");
        serverCard2.put("memoryImgUrl","http://localhost:8080/img/lc2.png");
        serverCard2.put("storageText","42");
        serverCard2.put("storageImgUrl","http://localhost:8080/img/lc1.png");
        serverCard2.put("httpConnText","20");
        serverCard2.put("httpConnImgUrl","http://localhost:8080/img/bg1.png");
        serverCard2.put("dbConnText","12");
        serverCard2.put("dbConnIUrl","http://localhost:8080/img/bg1.png");
        result.add(serverCard2);

        Map<String, String> serverCard3 = new HashMap<>();
        serverCard3.put("serverName", "Server3");
        serverCard3.put("cpuText","88");
        serverCard3.put("cpuImgUrl","http://localhost:8080/img/lc1.png");
        serverCard3.put("memoryText","67");
        serverCard3.put("memoryImgUrl","http://localhost:8080/img/lc2.png");
        serverCard3.put("storageText","34");
        serverCard3.put("storageImgUrl","http://localhost:8080/img/lc1.png");
        serverCard3.put("httpConnText","23");
        serverCard3.put("httpConnImgUrl","http://localhost:8080/img/bg1.png");
        serverCard3.put("dbConnText","13");
        serverCard3.put("dbConnIUrl","http://localhost:8080/img/bg1.png");
        result.add(serverCard3);

        Map<String, String> serverCard4 = new HashMap<>();
        serverCard4.put("serverName", "Server4");
        serverCard4.put("cpuText","30");
        serverCard4.put("cpuImgUrl","http://localhost:8080/img/lc1.png");
        serverCard4.put("memoryText","41");
        serverCard4.put("memoryImgUrl","http://localhost:8080/img/lc2.png");
        serverCard4.put("storageText","39");
        serverCard4.put("storageImgUrl","http://localhost:8080/img/lc1.png");
        serverCard4.put("httpConnText","19");
        serverCard4.put("httpConnImgUrl","http://localhost:8080/img/bg1.png");
        serverCard4.put("dbConnText","9");
        serverCard4.put("dbConnIUrl","http://localhost:8080/img/bg1.png");
        result.add(serverCard4);


        return result;
    }


}
