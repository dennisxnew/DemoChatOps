package com.hyt.chatops.controllers;

import com.hyt.chatops.beans.req.ShowLogReq;
import com.hyt.chatops.beans.res.LogContent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
        serverCard1.put("cpuImgUrl","http://demochatops.azurewebsites.net/img/lc1.png");
        serverCard1.put("memoryText","85");
        serverCard1.put("memoryImgUrl","http://demochatops.azurewebsites.net/img/lc2.png");
        serverCard1.put("storageText","61");
        serverCard1.put("storageImgUrl","http://demochatops.azurewebsites.net/img/lc1.png");
        serverCard1.put("httpConnText","27");
        serverCard1.put("httpConnImgUrl","http://demochatops.azurewebsites.net/img/bg1.png");
        serverCard1.put("dbConnText","15");
        serverCard1.put("dbConnIUrl","http://demochatops.azurewebsites.net/img/bg1.png");
        result.add(serverCard1);

        Map<String, String> serverCard2 = new HashMap<>();
        serverCard2.put("serverName", "Server2");
        serverCard2.put("cpuText","47");
        serverCard2.put("cpuImgUrl","http://demochatops.azurewebsites.net/img/lc1.png");
        serverCard2.put("memoryText","40");
        serverCard2.put("memoryImgUrl","http://demochatops.azurewebsites.net/img/lc2.png");
        serverCard2.put("storageText","42");
        serverCard2.put("storageImgUrl","http://demochatops.azurewebsites.net/img/lc1.png");
        serverCard2.put("httpConnText","20");
        serverCard2.put("httpConnImgUrl","http://demochatops.azurewebsites.net/img/bg1.png");
        serverCard2.put("dbConnText","12");
        serverCard2.put("dbConnIUrl","http://demochatops.azurewebsites.net/img/bg1.png");
        result.add(serverCard2);

        Map<String, String> serverCard3 = new HashMap<>();
        serverCard3.put("serverName", "Server3");
        serverCard3.put("cpuText","88");
        serverCard3.put("cpuImgUrl","http://demochatops.azurewebsites.net/img/lc1.png");
        serverCard3.put("memoryText","67");
        serverCard3.put("memoryImgUrl","http://demochatops.azurewebsites.net/img/lc2.png");
        serverCard3.put("storageText","34");
        serverCard3.put("storageImgUrl","http://demochatops.azurewebsites.net/img/lc1.png");
        serverCard3.put("httpConnText","23");
        serverCard3.put("httpConnImgUrl","http://demochatops.azurewebsites.net/img/bg1.png");
        serverCard3.put("dbConnText","13");
        serverCard3.put("dbConnIUrl","http://demochatops.azurewebsites.net/img/bg1.png");
        result.add(serverCard3);

        Map<String, String> serverCard4 = new HashMap<>();
        serverCard4.put("serverName", "Server4");
        serverCard4.put("cpuText","30");
        serverCard4.put("cpuImgUrl","http://demochatops.azurewebsites.net/img/lc1.png");
        serverCard4.put("memoryText","41");
        serverCard4.put("memoryImgUrl","http://demochatops.azurewebsites.net/img/lc2.png");
        serverCard4.put("storageText","39");
        serverCard4.put("storageImgUrl","http://demochatops.azurewebsites.net/img/lc1.png");
        serverCard4.put("httpConnText","19");
        serverCard4.put("httpConnImgUrl","http://demochatops.azurewebsites.net/img/bg1.png");
        serverCard4.put("dbConnText","9");
        serverCard4.put("dbConnIUrl","http://demochatops.azurewebsites.net/img/bg1.png");
        result.add(serverCard4);


        return result;
    }

    @GetMapping("/getMemberCards")
    public List<Map<String,String>> getMemberCards(){
        Map<String, String> memberCard1 = new HashMap<>();
        memberCard1.put("name","王小明");
        memberCard1.put("enName","Ming.Wang");
        memberCard1.put("profileImage","http://demochatops.azurewebsites.net/img/w.png");
        memberCard1.put("position","PM");
        memberCard1.put("phone","0912-123-123");
        memberCard1.put("Email","member1@example.com");
        Map<String, String> memberCard2 = new HashMap<>();
        memberCard2.put("name","陳小華");
        memberCard2.put("enName","Hua.Chen");
        memberCard2.put("profileImage","http://demochatops.azurewebsites.net/img/c.png");
        memberCard2.put("position","SA");
        memberCard2.put("phone","0912-123-123");
        memberCard2.put("Email","member2@example.com");
        Map<String, String> memberCard3 = new HashMap<>();
        memberCard3.put("name","派大興");
        memberCard3.put("enName","Star.Pi");
        memberCard3.put("profileImage","http://demochatops.azurewebsites.net/img/p.png");
        memberCard3.put("position","SD");
        memberCard3.put("phone","0912-123-123");
        memberCard3.put("Email","member3@example.com");
        Map<String, String> memberCard4 = new HashMap<>();
        memberCard4.put("name","劉大頭");
        memberCard4.put("enName","Head.Liu");
        memberCard4.put("profileImage","http://demochatops.azurewebsites.net/img/l.png");
        memberCard4.put("position","PG");
        memberCard4.put("phone","0912-123-123");
        memberCard4.put("Email","member4@example.com");
        Map<String, String> memberCard5 = new HashMap<>();
        memberCard4.put("name","黃子青");
        memberCard4.put("enName","tc.huang");
        memberCard4.put("profileImage","http://demochatops.azurewebsites.net/img/l.png");
        memberCard4.put("position","PM");
        memberCard4.put("phone","0912-123-123");
        memberCard4.put("Email","member5@example.com");

        List<Map<String, String>> memberCards = new ArrayList<>();
        memberCards.add(memberCard1);
        memberCards.add(memberCard2);
        memberCards.add(memberCard3);
        memberCards.add(memberCard4);
        memberCards.add(memberCard5);

        return memberCards;
    }

    @PostMapping("getLogs")
    public List<LogContent> getLogs(@RequestBody ShowLogReq showLogReq){
        List<LogContent> logContentList = new ArrayList<>();
        List<LogContent> result = new ArrayList<>();
        SimpleDateFormat requestSf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        try {
            Date startTime = requestSf.parse(showLogReq.getStart());
            Date endTime = requestSf.parse(showLogReq.getEnd());


            //1. 初始Test資料
            logContentList.add(new LogContent(sf.parse("2021-01-02 21:01:12.191"), "WARN", "com.demo.service.LoginServiceImpl", "Exception in thread \"main\" java.nio.file.NoSuchFileException: players.dat <-- players.dat file doesn't exist at sun.nio.fs.WindowsException.translateToIOException(Unknown Source) at sun.nio.fs.WindowsException.rethrowAsIOException(Unknown Source) at java.nio.file.Files.readAllLines(Unknown Source) at java.nio.file.Files.readAllLines(Unknown Source) at Exceptions.getPlayers(Exceptions.java:12) <-- Exception arises in getPlayers() method, on line 12 at Exceptions.main(Exceptions.java:19) <-- getPlayers() is called by main(), on line 19"));
            logContentList.add(new LogContent(sf.parse("2021-01-03 12:11:12.282"), "WARN", "com.demo.service.AccountServiceImpl", "Exception in thread \"main\" java.nio.file.NoSuchFileException: players.dat <-- players.dat file doesn't exist at sun.nio.fs.WindowsException.translateToIOException(Unknown Source) at sun.nio.fs.WindowsException.rethrowAsIOException(Unknown Source) at java.nio.file.Files.readAllLines(Unknown Source) at java.nio.file.Files.readAllLines(Unknown Source) at Exceptions.getPlayers(Exceptions.java:12) <-- Exception arises in getPlayers() method, on line 12 at Exceptions.main(Exceptions.java:19) <-- getPlayers() is called by main(), on line 19"));
            logContentList.add(new LogContent(sf.parse("2021-01-04 23:23:12.373"), "WARN", "com.demo.service.PaymentServiceImpl", "Exception in thread \"main\" java.nio.file.NoSuchFileException: players.dat <-- players.dat file doesn't exist at sun.nio.fs.WindowsException.translateToIOException(Unknown Source) at sun.nio.fs.WindowsException.rethrowAsIOException(Unknown Source) at java.nio.file.Files.readAllLines(Unknown Source) at java.nio.file.Files.readAllLines(Unknown Source) at Exceptions.getPlayers(Exceptions.java:12) <-- Exception arises in getPlayers() method, on line 12 at Exceptions.main(Exceptions.java:19) <-- getPlayers() is called by main(), on line 19"));
            logContentList.add(new LogContent(sf.parse("2021-01-05 08:55:12.454"), "ERROR", "com.demo.service.LoginServiceImpl", "Exception in thread \"main\" java.nio.file.NoSuchFileException: players.dat <-- players.dat file doesn't exist at sun.nio.fs.WindowsException.translateToIOException(Unknown Source) at sun.nio.fs.WindowsException.rethrowAsIOException(Unknown Source) at java.nio.file.Files.readAllLines(Unknown Source) at java.nio.file.Files.readAllLines(Unknown Source) at Exceptions.getPlayers(Exceptions.java:12) <-- Exception arises in getPlayers() method, on line 12 at Exceptions.main(Exceptions.java:19) <-- getPlayers() is called by main(), on line 19"));
            logContentList.add(new LogContent(sf.parse("2021-01-05 09:17:12.546"), "ERROR", "com.demo.service.PaymentServiceImpl", "Exception in thread \"main\" java.nio.file.NoSuchFileException: players.dat <-- players.dat file doesn't exist at sun.nio.fs.WindowsException.translateToIOException(Unknown Source) at sun.nio.fs.WindowsException.rethrowAsIOException(Unknown Source) at java.nio.file.Files.readAllLines(Unknown Source) at java.nio.file.Files.readAllLines(Unknown Source) at Exceptions.getPlayers(Exceptions.java:12) <-- Exception arises in getPlayers() method, on line 12 at Exceptions.main(Exceptions.java:19) <-- getPlayers() is called by main(), on line 19"));
            logContentList.add(new LogContent(sf.parse("2021-01-05 10:10:12.637"), "ERROR", "com.demo.service.FulfillmentServiceImpl", "Exception in thread \"main\" java.nio.file.NoSuchFileException: players.dat <-- players.dat file doesn't exist at sun.nio.fs.WindowsException.translateToIOException(Unknown Source) at sun.nio.fs.WindowsException.rethrowAsIOException(Unknown Source) at java.nio.file.Files.readAllLines(Unknown Source) at java.nio.file.Files.readAllLines(Unknown Source) at Exceptions.getPlayers(Exceptions.java:12) <-- Exception arises in getPlayers() method, on line 12 at Exceptions.main(Exceptions.java:19) <-- getPlayers() is called by main(), on line 19"));
            logContentList.add(new LogContent(sf.parse("2021-01-06 03:27:12.728"), "ERROR", "com.demo.service.OrderServiceImpl", "Exception in thread \"main\" java.nio.file.NoSuchFileException: players.dat <-- players.dat file doesn't exist at sun.nio.fs.WindowsException.translateToIOException(Unknown Source) at sun.nio.fs.WindowsException.rethrowAsIOException(Unknown Source) at java.nio.file.Files.readAllLines(Unknown Source) at java.nio.file.Files.readAllLines(Unknown Source) at Exceptions.getPlayers(Exceptions.java:12) <-- Exception arises in getPlayers() method, on line 12 at Exceptions.main(Exceptions.java:19) <-- getPlayers() is called by main(), on line 19"));
            logContentList.add(new LogContent(sf.parse("2021-01-06 13:59:12.829"), "ERROR", "com.demo.service.OrderServiceImpl", "Exception in thread \"main\" java.nio.file.NoSuchFileException: players.dat <-- players.dat file doesn't exist at sun.nio.fs.WindowsException.translateToIOException(Unknown Source) at sun.nio.fs.WindowsException.rethrowAsIOException(Unknown Source) at java.nio.file.Files.readAllLines(Unknown Source) at java.nio.file.Files.readAllLines(Unknown Source) at Exceptions.getPlayers(Exceptions.java:12) <-- Exception arises in getPlayers() method, on line 12 at Exceptions.main(Exceptions.java:19) <-- getPlayers() is called by main(), on line 19"));
            logContentList.add(new LogContent(sf.parse("2021-01-03 07:33:12.189"), "ERROR", "com.demo.service.EmailServiceImpl", "Exception in thread \"main\" java.nio.file.NoSuchFileException: players.dat <-- players.dat file doesn't exist at sun.nio.fs.WindowsException.translateToIOException(Unknown Source) at sun.nio.fs.WindowsException.rethrowAsIOException(Unknown Source) at java.nio.file.Files.readAllLines(Unknown Source) at java.nio.file.Files.readAllLines(Unknown Source) at Exceptions.getPlayers(Exceptions.java:12) <-- Exception arises in getPlayers() method, on line 12 at Exceptions.main(Exceptions.java:19) <-- getPlayers() is called by main(), on line 19"));
            logContentList.add(new LogContent(sf.parse("2021-01-04 01:51:12.193"), "FATAL", "com.demo.service.PaymentServiceImpl", "Exception in thread \"main\" java.nio.file.NoSuchFileException: players.dat <-- players.dat file doesn't exist at sun.nio.fs.WindowsException.translateToIOException(Unknown Source) at sun.nio.fs.WindowsException.rethrowAsIOException(Unknown Source) at java.nio.file.Files.readAllLines(Unknown Source) at java.nio.file.Files.readAllLines(Unknown Source) at Exceptions.getPlayers(Exceptions.java:12) <-- Exception arises in getPlayers() method, on line 12 at Exceptions.main(Exceptions.java:19) <-- getPlayers() is called by main(), on line 19"));
            logContentList.add(new LogContent(sf.parse("2021-01-05 11:27:12.169"), "FATAL", "com.demo.service.OrderServiceImpl", "Exception in thread \"main\" java.nio.file.NoSuchFileException: players.dat <-- players.dat file doesn't exist at sun.nio.fs.WindowsException.translateToIOException(Unknown Source) at sun.nio.fs.WindowsException.rethrowAsIOException(Unknown Source) at java.nio.file.Files.readAllLines(Unknown Source) at java.nio.file.Files.readAllLines(Unknown Source) at Exceptions.getPlayers(Exceptions.java:12) <-- Exception arises in getPlayers() method, on line 12 at Exceptions.main(Exceptions.java:19) <-- getPlayers() is called by main(), on line 19"));

            List<String> levelList;
            if (showLogReq.getLevel() != null || showLogReq.getLevel().length() > 0) {
                levelList = Arrays.asList(showLogReq.getLevel().split(","));
            } else {
                levelList = Arrays.asList("WARN", "ERROR", "FATAL");
            }

            //2. 過濾資料
            result = logContentList.stream().filter(item -> levelList.contains(item.getLevel()))
                                            .filter(item -> item.getDate().after(startTime) && item.getDate().before(endTime))
                                            .collect(Collectors.toList());

        }catch (Exception e){
            log.error("取得log發生異常", e);
        }
        

        return result;
    }

}
