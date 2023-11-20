package org.example.engine;

import org.example.NumberRange;
import org.example.message.MessageFactory;

public abstract class RangeEngine implements Engine{

    private final NumberRange numberRange;
    private final MessageFactory messageFactory;

    public RangeEngine(NumberRange numberRange, MessageFactory messageFactory) {
        this.numberRange = numberRange;
        this.messageFactory = messageFactory;
    }

    @Override
    public void run() {
        for (Integer step: numberRange) {
            handleMessage(messageFactory.getMessage(step));
        }
    }

    public abstract void handleMessage(String message);
}
