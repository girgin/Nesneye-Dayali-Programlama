package com.hns.oop.notifier;

public class Email {
    private String from;
    private String to;
    private String subject;
    private String text;

    public Email(String from, String to, String subject, String text) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.text = text;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        String str = "From: " + getFrom() + "\n" +
                     "To: " + getTo() + "\n" +
                     "Subject: " + getSubject() + "\n" +
                     "Text: " + getText();
        return str;
    }
    
}
