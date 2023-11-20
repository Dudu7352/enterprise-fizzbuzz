package org.example.message;

import org.example.message.ruleset.MessageRuleSet;

import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.stream.Collectors;

public class MessageFactory {
    private final String delimiter;
    private final MessageRuleSet messageRuleSet;

    public MessageFactory(MessageRuleSet messageRuleSet, String delimiter) {
        this.messageRuleSet = messageRuleSet;
        this.delimiter = delimiter;
    }

    public String getMessage(int step) {
        String message = messageRuleSet.test(step)
                .stream()
                .filter(Objects::nonNull)
                .collect(Collectors.joining(delimiter));

        if(message.isEmpty())
            throw new NoSuchElementException("No match for the given step");

        return message;
    }
}
