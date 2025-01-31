# Basic Threading in Java

## Overview
This section covers the fundamentals of multithreading in Java, including creating threads using `Thread` and `Runnable`. These are essential concepts to understand how Java handles parallel execution.

## Topics Covered
1. **Creating a Thread using the `Thread` class**
2. **Creating a Thread using the `Runnable` interface**
3. **Understanding the Thread Lifecycle**
4. **Thread Methods (`start()`, `sleep()`, `join()`, etc.)**

---

## 1. Creating a Thread Using the `Thread` Class
Java provides the `Thread` class, which can be extended to create a thread.

```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); // Start the thread
    }
}
```

### Explanation:
- The `run()` method contains the code that will execute in the thread.
- The `start()` method **creates a new thread and executes `run()` asynchronously**.

---

## 2. Creating a Thread Using the `Runnable` Interface
If your class needs to extend another class, implementing `Runnable` is the better approach.

```java
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running using Runnable...");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        t1.start(); // Start the thread
    }
}
```

### Why Use `Runnable`?
- Java does not support multiple inheritance, so a class cannot extend both `Thread` and another class.
- Implementing `Runnable` allows the class to be used flexibly with multiple threading strategies.

Use Runnable when:

- You need to extend another class.
- You need to share resources across multiple threads.
- You want to use Executors for efficient thread management.
- You don’t need a return value from the thread.

---

## 3. Understanding the Thread Lifecycle
A thread in Java has several states:

| State         | Description |
|--------------|------------|
| **NEW**      | Thread is created but not started. |
| **RUNNABLE** | Ready to run but waiting for CPU allocation. |
| **RUNNING**  | Actively executing. |
| **BLOCKED**  | Waiting for a resource (e.g., synchronized lock). |
| **WAITING**  | Waiting indefinitely for another thread's signal. |
| **TERMINATED** | Execution has finished. |

---

## 4. Common Thread Methods
| Method | Description |
|--------|------------|
| `start()` | Begins thread execution. |
| `run()` | Contains the code to be executed. |
| `sleep(ms)` | Pauses execution for a given time. |
| `join()` | Waits for another thread to complete. |
| `isAlive()` | Checks if a thread is still running. |

### Example: Using `sleep()` and `join()`
```java
class ThreadExample extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread running: " + i);
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadExample t1 = new ThreadExample();
        t1.start();
        t1.join(); // Main thread waits for t1 to finish
        System.out.println("Main thread resumes after t1 completion");
    }
}
```

---

## Summary
✔ **`Thread` vs `Runnable`** – Use `Runnable` for flexibility.  
✔ **Lifecycle States** – Know the different stages of a thread.  
✔ **Thread Methods** – `start()`, `join()`, and `sleep()` are commonly used.

This section provides the **basic building blocks** of multithreading in Java. In the next sections, we will explore **synchronization, executors, and advanced multithreading techniques.** 🚀

