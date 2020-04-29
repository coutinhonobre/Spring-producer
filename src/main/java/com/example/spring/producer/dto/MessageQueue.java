package com.example.spring.producer.dto;

import java.util.Date;

public class MessageQueue {
    private String text;

    public MessageQueue() {}

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text + " - " + new Date().toString();
    }
}