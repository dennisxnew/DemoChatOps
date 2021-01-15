package com.hyt.chatops.beans.req;

/**
 * @author Dennis.Chen
 * @Date 2021-01-15
 */
public class ShowLogReq {

    String start;
    String end;
    String level;

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
