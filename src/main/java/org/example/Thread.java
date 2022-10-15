package org.example;

import static org.example.ThreadColor.ANSI_BLUE;

public class Thread extends java.lang.Thread {

    public Thread(ThreadRunnable threadRunnable) {
    }

    public Thread() {

    }

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Keep Up the good work!!!");
    }
}
