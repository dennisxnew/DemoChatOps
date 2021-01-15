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

    @GetMapping("/getMemberCards")
    public List<Map<String,String>> getMemberCards(){
        Map<String, String> memberCard1 = new HashMap<>();
        memberCard1.put("name","王小明");
        memberCard1.put("enName","Ming.Wang");
        memberCard1.put("profileImage","http://localhost:8080/img/w.png");
        memberCard1.put("position","PM");
        memberCard1.put("phone","0912-123-123");
        memberCard1.put("Email","member1@example.com");
        Map<String, String> memberCard2 = new HashMap<>();
        memberCard2.put("name","陳小華");
        memberCard2.put("enName","Hua.Chen");
        memberCard2.put("profileImage","http://localhost:8080/img/c.png");
        memberCard2.put("position","SA");
        memberCard2.put("phone","0912-123-123");
        memberCard2.put("Email","member2@example.com");
        Map<String, String> memberCard3 = new HashMap<>();
        memberCard3.put("name","派大興");
        memberCard3.put("enName","Star.Pi");
        memberCard3.put("profileImage","http://localhost:8080/img/p.png");
        memberCard3.put("position","SD");
        memberCard3.put("phone","0912-123-123");
        memberCard3.put("Email","member3@example.com");
        Map<String, String> memberCard4 = new HashMap<>();
        memberCard4.put("name","劉大頭");
        memberCard4.put("enName","Head.Liu");
        memberCard4.put("profileImage","http://localhost:8080/img/l.png");
        memberCard4.put("position","PG");
        memberCard4.put("phone","0912-123-123");
        memberCard4.put("Email","member4@example.com");

        List<Map<String, String>> memberCards = new ArrayList<>();
        memberCards.add(memberCard1);
        memberCards.add(memberCard2);
        memberCards.add(memberCard3);
        memberCards.add(memberCard4);

        return memberCards;
    }



}
