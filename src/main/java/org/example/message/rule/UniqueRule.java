package org.example.message.rule;

import org.example.message.ruleset.MessageRuleSetAnalysisContext;

import java.util.Objects;

public class UniqueRule implements MessageRule{
    private final MessageRule internalRule;

    public UniqueRule(MessageRule internalRule) {
        this.internalRule = internalRule;
    }

    @Override
    public String test(MessageRuleSetAnalysisContext context, int step) {
        if(context.getPreviousMatches().stream().anyMatch(Objects::nonNull)) {
            return null;
        } else {
            return internalRule.test(context, step);
        }
    }
}
