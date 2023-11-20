package org.example.message.ruleset;

import java.util.LinkedList;
import java.util.List;

public class MessageRuleSetAnalysisContext {
    private final LinkedList<String> previousMatches = new LinkedList<>();

    public List<String> getPreviousMatches() {
        return previousMatches;
    }

    public void addMatch(String match) {
        previousMatches.add(match);
    }
}
