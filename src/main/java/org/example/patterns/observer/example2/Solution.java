package org.example.patterns.observer.example2;

import java.io.FileNotFoundException;

public class Solution {
    public static void main(String[] args) {
        Editor editor = new Editor();

        try {
            EventListener logOpenListener = new LogOpenListener("D:/log/file.txt");
            editor.events.subscribe("open", logOpenListener);
            editor.events.subscribe("save", logOpenListener);
            editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
