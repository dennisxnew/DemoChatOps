package com.hyt.chatops.restful;

import com.hyt.chatops.uibeans.FactSet;
import com.hyt.chatops.uibeans.TextBlock;

public class ServerCard {
    private TextBlock textBlock;
    private FactSet factSet;

    public TextBlock getTextBlock() {
        return textBlock;
    }

    public void setTextBlock(TextBlock textBlock) {
        this.textBlock = textBlock;
    }

    public FactSet getFactSet() {
        return factSet;
    }

    public void setFactSet(FactSet factSet) {
        this.factSet = factSet;
    }
}
