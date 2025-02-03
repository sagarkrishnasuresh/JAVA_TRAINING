package com.example.threading.basicthreading;

class SimpleThread extends Thread {
    public void run() {
        for (int i =1; i<=5; i++) {
            System.out.println("Thread running:  " + i);
            try {
                Thread.sleep(1000); //1sec pause
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        SimpleThread t1 = new SimpleThread();
        t1.start();
    }


}
