package com.change.strategy;

import java.util.List;
import java.util.stream.Collectors;

public final class StreamLowerCaseStrategy implements ChangeStrategy {
    @Override
    public List<String> changeFiles(final List<String> listOfStrings) {
        return listOfStrings.stream()
                .map(s -> s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase())
                .collect(Collectors.toList());
    }
}
