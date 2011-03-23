package com.github.eventsource.client;

import java.io.IOException;

public class EventSourceException extends IOException {
    public EventSourceException(String s) {
        super(s);
    }

    public EventSourceException(String s, Throwable throwable) {
        super(s, throwable);
    }
}