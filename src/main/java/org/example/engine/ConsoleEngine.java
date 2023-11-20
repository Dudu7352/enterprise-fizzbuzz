package org.example.engine;

import org.example.message.MessageFactory;
import org.example.NumberRange;

public class ConsoleEngine extends RangeEngine{
    public ConsoleEngine(NumberRange numberRange, MessageFactory messageFactory) {
        super(numberRange, messageFactory);
    }

    @Override
    public void handleMessage(String message) {
        System.out.println(message);
    }
}
