package org.example.patterns.observer.example2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class LogOpenListener implements EventListener{

    private File log;

    private FileOutputStream fos;

    public LogOpenListener(String fileName) throws FileNotFoundException {
        this.log = new File(fileName);
        fos = new FileOutputStream(log, true);
    }

    @Override
    public void update(String eventType, File file) {
        String logMsg = "Someone has performed " + eventType + " operation with the following file: " + file.getName() + "\n";
        try {
            fos.write(logMsg.getBytes());
            fos.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Save to log " + logMsg);
    }

}
