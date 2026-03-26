package com.gla.Threads;
    class StudentEntry implements Runnable {
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " monitoring student entry...");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("Interrupted");
                }
            }
        }
    }

    class QuestionPaper implements Runnable {
        public void run() {
            try {
                Thread.sleep(5000);
                System.out.println(Thread.currentThread().getName() + " distributing question papers...");
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
    }

    class Attendance implements Runnable {
        public void run() {
            try {
                Thread.sleep(10000);
                System.out.println(Thread.currentThread().getName() + " marking attendance...");
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
    }

    class AnswerSheet implements Runnable {
        public void run() {
            try {
                Thread.sleep(15000);
                System.out.println(Thread.currentThread().getName() + " collecting answer sheets...");
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
    }
