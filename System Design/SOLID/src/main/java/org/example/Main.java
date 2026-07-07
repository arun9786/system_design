package org.example;

import org.w3c.dom.css.Counter;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Chief chief = new Chief();

        Thread thread = new Thread(
                ()-> {
                    for (int i = 1; i <=10; i++) {
                        try {
                            chief.producer(i);
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
        );

        thread.start();

        Thread thread2 = new Thread(
                ()-> {
                    for (int i = 1; i <=5; i++) {
                        try {
                            chief.consumer();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
        );
        thread2.start();

        Thread thread3 = new Thread(
                ()-> {
                    for (int i = 1; i <=5; i++) {
                        try {
                            chief.consumer();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
        );
        thread3.start();


    }
}

class Chief {

    int data;
    BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

    public  void producer(int i) throws InterruptedException {
        queue.offer(i);
        System.out.println("Producer " + i);
    }
    public synchronized void consumer() throws InterruptedException {
        System.out.println("Consuming");
        System.out.println("Consumer " + queue.take());
    }

}
