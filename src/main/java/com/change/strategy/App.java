package com.change.strategy;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        ChangeContext changeContext = new ChangeContext();
        List<String> listToUpperCase = new ArrayList<>();
        listToUpperCase.add("NaMe");
        listToUpperCase.add("SuRnamE");
        List<String> listToLowerCase = new ArrayList<>();
        listToLowerCase.add("AdDresS");
        listToLowerCase.add("CitY");
        listToLowerCase.add("Phone nuMber");

        changeContext.setStrategy(new UpperCaseStrategy());
        List<String> changedListToUpperCase = changeContext.changeStrings(listToUpperCase);

        changeContext.setStrategy(new StreamLowerCaseStrategy());
        List<String> changedListToLowerCasee = changeContext.changeStrings(listToLowerCase);

        for(String value : changedListToUpperCase) {
            System.out.println(value);
        }

        for(String value : changedListToLowerCasee) {
            System.out.println(value);
        }
    }
}
