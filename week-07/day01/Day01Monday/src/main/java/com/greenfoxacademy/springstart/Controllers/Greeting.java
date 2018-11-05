package com.greenfoxacademy.springstart.Controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
    long id;
    String content;

    public Greeting(Long id, String content) {
    }

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}
