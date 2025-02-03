package com.example.threading.basicthreading;

class RunnableExample implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread running: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interupted: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        RunnableExample runnable = new RunnableExample();
        Thread t1 = new Thread(runnable);
        t1.start();
    }
}
