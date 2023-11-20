package org.example.message.ruleset;

import org.example.message.rule.MessageRule;

import java.util.LinkedList;
import java.util.List;

public class MessageRuleSet {
    private final List<MessageRule> messageRuleList;

    private MessageRuleSet(List<MessageRule> messageRuleList) {
        this.messageRuleList = messageRuleList;
    }

    public List<String> test(int step) {
        MessageRuleSetAnalysisContext context = new MessageRuleSetAnalysisContext();
        for(MessageRule messageRule : messageRuleList) {
            context.addMatch(messageRule.test(context, step));
        }
        return context.getPreviousMatches();
    }

    public static class Builder {
        List<MessageRule> messageRuleList = new LinkedList<>();
        public Builder addMessageRule(MessageRule messageRule) {
            messageRuleList.add(messageRule);
            return this;
        }
        public MessageRuleSet build() {
            return new MessageRuleSet(messageRuleList);
        }
    }
}
