package com.hyt.chatops.uibeans;

import java.util.List;

public class FactSet {

    private String type;
    private List<Fact> facts;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Fact> getFacts() {
        return facts;
    }

    public void setFacts(List<Fact> facts) {
        this.facts = facts;
    }
}
