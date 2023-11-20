package org.example.message.rule;

import org.example.message.ruleset.MessageRuleSetAnalysisContext;

public interface MessageRule {
    String test(MessageRuleSetAnalysisContext context, int step);
}
