package com.example.bookofpatterns.observer;

public class Runner {
    public static void main(String[] args) {
        Editor editor = new Editor();

        editor.events.subscribe("open", new LogOpenedListener());
        editor.events.subscribe("save", new EmailNotificationListener("File Opened"));
        editor.events.subscribe("save", new SendSmsListener());

        editor.openFile("teste");

        editor.saveFile();


    }
}
