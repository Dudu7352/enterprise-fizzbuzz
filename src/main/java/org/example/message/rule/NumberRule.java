package org.example.message.rule;

import org.example.message.ruleset.MessageRuleSetAnalysisContext;

public class NumberRule implements MessageRule{
    @Override
    public String test(MessageRuleSetAnalysisContext context, int step) {
        return String.valueOf(step);
    }
}
