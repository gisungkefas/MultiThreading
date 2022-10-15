import org.example.Thread;
import org.example.ThreadRunnable;

import static org.example.ThreadColor.*;

public class Main {
    public static void main(String[] args) {

        System.out.println(ANSI_GREEN + "Welcome to thread practice");

        Thread thread = new Thread();
        thread.start();

        new Thread(){
            public void run() {
                System.out.println(ANSI_RED + "Anonymous thread in the main to help you execute more than one thread from the main");
            }
        }.start();

        ThreadRunnable threadRunnable = new ThreadRunnable();
        threadRunnable.run();

        new ThreadRunnable(){
            @Override
            public void run() {
                System.out.println(ANSI_BLACK + "The Runnable is active");
            }
        }.run();


        System.out.println(ANSI_PURPLE + "Practice in Progress.");

    }
}