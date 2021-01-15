package com.hyt.chatops.uibeans;

import java.util.List;

public class ActionSet {
    private String type;
    private List<Action> actions;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }
}
