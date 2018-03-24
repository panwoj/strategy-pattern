package com.change.strategy;

import java.util.ArrayList;
import java.util.List;

public class UpperCaseStrategy implements ChangeStrategy {
    @Override
    public List<String> changeFiles(List<String> listOfStrings) {
        List<String> changedList = new ArrayList<>();
        for(String title : listOfStrings) {
            changedList.add(title.toUpperCase());
        }
        return changedList;
    }
}
