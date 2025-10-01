package com.tnsif.eighth;

class JoinExample extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - i: " + i);
            try {
                Thread.sleep(500); // sleep for half a second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        JoinExample t1 = new JoinExample();
        JoinExample t2 = new JoinExample();

        t1.start();
        try {
            t1.join(); // main thread waits until t1 finishes
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        t2.start(); // starts only after t1 completes
    }
}
