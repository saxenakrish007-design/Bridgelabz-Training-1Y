package com.gla.Threads;
    import java.util.*;
    class Ticket extends Thread {
        private int ticketId;
        private String type;
        public int priority;
        private int queuePosition;
        private long waitStart;

        public static List<Long> p10 = new ArrayList<>();
        public static List<Long> p4 = new ArrayList<>();
        public static List<Long> p2 = new ArrayList<>();
        public static List<Long> p1 = new ArrayList<>();

        public Ticket(int id, String type, int priority, int queuePosition) {
            this.ticketId = id;
            this.type = type;
            this.priority = priority;
            this.queuePosition = queuePosition;
        }

        public void run() {
            waitStart = System.currentTimeMillis();

            System.out.println(getName() + " STARTED Ticket " + ticketId +
                    " [" + type + "] Priority: " + priority +
                    " Queue Position: " + queuePosition);

            int sleepTime = (int)(Math.random() * 5 + 1);

            try {
                Thread.sleep(sleepTime * 1000);
            } catch (InterruptedException e) {}

            long waitEnd = System.currentTimeMillis();
            long totalTime = (waitEnd - waitStart) / 1000;

            System.out.println(getName() + " COMPLETED Ticket " + ticketId +
                    " in " + totalTime + " sec");

            if (priority == 10) p10.add(totalTime);
            else if (priority == 4) p4.add(totalTime);
            else if (priority == 2) p2.add(totalTime);
            else if (priority == 1) p1.add(totalTime);
        }
    }
