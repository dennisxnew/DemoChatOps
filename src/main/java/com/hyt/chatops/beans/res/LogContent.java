package com.hyt.chatops.beans.res;

/**
 * @author Dennis.Chen
 * @Date 2020-01-15
 * @descript 存放log資訊
 */
public class LogContent {

    String title;
    String level;
    String message;

    public LogContent() {
    }

    public LogContent(String title, String level, String message) {
        this.title = title;
        this.level = level;
        this.message = message;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
