package com.hyt.chatops.uibeans;

import java.util.List;

public class ColumnSet {
    private String type;
    private List<Column> columns;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Column> getColumns() {
        return columns;
    }

    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }
}
