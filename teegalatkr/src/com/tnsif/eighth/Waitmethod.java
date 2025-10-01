package com.tnsif.eighth;

class SharedResource {
    private boolean available = false;

    // Producer method
    public synchronized void produce() {
        try {
            while (available) {
                wait(); // Wait if resource is already available
            }
            System.out.println("Produced an item");
            available = true;
            notify(); // Notify one waiting thread
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Consumer method
    public synchronized void consume() {
        try {
            while (!available) {
                wait(); // Wait if resource is not available
            }
            System.out.println(Thread.currentThread().getName() + " consumed an item");
            available = false;
            notifyAll(); // Notify all waiting threads
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Waitmethod {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        // Producer Thread
        Thread producer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                resource.produce();
                try { Thread.sleep(500); } catch (InterruptedException e) {}
            }
        });

        // Consumer Threads
        Thread consumer1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                resource.consume();
                try { Thread.sleep(1000); } catch (InterruptedException e) {}
            }
        }, "Consumer-1");

        Thread consumer2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                resource.consume();
                try { Thread.sleep(1000); } catch (InterruptedException e) {}
            }
        }, "Consumer-2");

        producer.start();
        consumer1.start();
        consumer2.start();
    }
}