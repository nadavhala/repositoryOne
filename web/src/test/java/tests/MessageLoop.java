package tests;

import org.testng.annotations.Test;

import static tests.SimpleThreads.threadMessage;

public class MessageLoop implements Runnable {
    //@Test
    public void run() {
        String importantInfo[] = {
                "shtock",
                "stom"
        };
        try {
            for (int i = 0;
                 i < importantInfo.length;
                 i++) {
                // Pause for 4 seconds
                Thread.sleep(4000);
                // Print a message
                threadMessage(importantInfo[i]);
            }
        } catch (InterruptedException e) {
            threadMessage("I wasn't done!");
        }
    }
}

















