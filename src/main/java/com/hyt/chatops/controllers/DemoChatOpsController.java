package com.hyt.chatops.controllers;

import com.hyt.chatops.restful.ServerCard;
import com.hyt.chatops.uibeans.Fact;
import com.hyt.chatops.uibeans.FactSet;
import com.hyt.chatops.uibeans.TextBlock;
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
    public Map<String, String> getTestMessage(){
        log.info("Start getTestMessage");

        Map<String, String> result = new HashMap<>();
        result.put("message", "Demo Test Message");
        log.info("End getTestMessage");

        return result;
    }

    @GetMapping("/getServerCards")
    public List<ServerCard> getServerCards(){
        List<ServerCard> serverCards = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            ServerCard serverCard = new ServerCard();

            TextBlock textBlock = new TextBlock();
            textBlock.setType("TextBlock");
            textBlock.setSize("Large");
            textBlock.setText("Server" + (i+1));
            textBlock.setWarp(true);
            textBlock.setHorizontalAlignment("Center");

            FactSet factSet = new FactSet();
            List<Fact> facts = new ArrayList<>();
            Fact cpu = new Fact("CPU :", "良好");
            Fact mem = new Fact("MEMORY :", "良好");
            Fact storage = new Fact("STORAGE :", "良好");
            facts.add(cpu);
            facts.add(mem);
            facts.add(storage);

            factSet.setType("FactSet");
            factSet.setFacts(facts);


            serverCard.setTextBlock(textBlock);
            serverCard.setFactSet(factSet);

            serverCards.add(serverCard);
        }

        return serverCards;
    }



}
