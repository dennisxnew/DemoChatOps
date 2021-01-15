package com.hyt.chatops.beans.res;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author Dennis.Chen
 * @Date 2021-01-15
 * @descript 存放log資訊
 */
public class LogContent {

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    Date date;
    String level;
    String className;
    String message;

    public LogContent() {
    }

    public LogContent(Date date, String level, String className, String message) {
        this.date = date;
        this.level = level;
        this.className = className;
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
