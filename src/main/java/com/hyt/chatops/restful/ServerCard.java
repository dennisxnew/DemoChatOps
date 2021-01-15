package com.hyt.chatops.restful;

import com.hyt.chatops.uibeans.ActionSet;
import com.hyt.chatops.uibeans.ColumnSet;
import com.hyt.chatops.uibeans.FactSet;
import com.hyt.chatops.uibeans.TextBlock;

public class ServerCard {
    private TextBlock textBlock;
    private ColumnSet columnSet;
    private FactSet factSet;
    private ActionSet actionSet;

    public TextBlock getTextBlock() {
        return textBlock;
    }

    public void setTextBlock(TextBlock textBlock) {
        this.textBlock = textBlock;
    }

    public ColumnSet getColumnSet() {
        return columnSet;
    }

    public void setColumnSet(ColumnSet columnSet) {
        this.columnSet = columnSet;
    }

    public FactSet getFactSet() {
        return factSet;
    }

    public void setFactSet(FactSet factSet) {
        this.factSet = factSet;
    }
}
