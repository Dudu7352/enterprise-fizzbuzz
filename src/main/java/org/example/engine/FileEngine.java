package org.example.engine;

import org.example.NumberRange;
import org.example.message.MessageFactory;

import java.io.FileWriter;
import java.io.IOException;

public class FileEngine extends RangeEngine{
    private final FileWriter file;
    public FileEngine(NumberRange numberRange, MessageFactory messageFactory, String filename) throws IOException {
        super(numberRange, messageFactory);
        file = new FileWriter(filename);
    }

    @Override
    public void handleMessage(String message) {
        try {
            file.write(message + "\n");
        } catch (IOException ignored) {}
    }
}
