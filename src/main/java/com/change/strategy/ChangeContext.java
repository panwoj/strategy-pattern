package com.change.strategy;

import java.util.List;

public class ChangeContext {
    private ChangeStrategy strategy;

    public void setStrategy(ChangeStrategy strategy) {
        this.strategy = strategy;
    }

    public List<String> changeStrings(List<String> listOfStrings) {
        return strategy.changeFiles(listOfStrings);
    }
}
