package org.example.message.rule;

import org.example.message.ruleset.MessageRuleSetAnalysisContext;

public class MessageModuloRule implements MessageRule {
    private final int divisor;
    private final String text;

    public MessageModuloRule(int divisor, String text) {
        this.divisor = divisor;
        this.text = text;
    }
    @Override
    public String test(MessageRuleSetAnalysisContext context, int step) {
        return step % divisor == 0 ? text : null;
    }
}
