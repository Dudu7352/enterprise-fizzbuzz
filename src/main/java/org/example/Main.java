package org.example;

import org.example.engine.ConsoleEngine;
import org.example.message.MessageFactory;
import org.example.message.rule.MessageModuloRule;
import org.example.message.ruleset.MessageRuleSet;
import org.example.message.rule.NumberRule;
import org.example.message.rule.UniqueRule;

public class Main {
    public static void main(String[] args) {
        ConsoleEngine engine = new ConsoleEngine(
                new NumberRange(1, 20, 1),
                new MessageFactory(
                        new MessageRuleSet.Builder()
                                .addMessageRule(new MessageModuloRule(3, "Fizz"))
                                .addMessageRule(new MessageModuloRule(5, "Buzz"))
                                .addMessageRule(new UniqueRule(new NumberRule()))
                                .build(),
                        ""
                )
        );

        engine.run();
    }
}