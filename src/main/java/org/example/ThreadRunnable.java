package org.example;

import static org.example.ThreadColor.ANSI_CYAN;

public class ThreadRunnable implements Runnable{


    @Override
    public void run() {
        System.out.println(ANSI_CYAN + "Testing the runnable method run()");
    }
}
