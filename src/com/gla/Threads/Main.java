package com.gla.Threads;

import java.util.List;

class Main {
        public static void main(String[] args) {

            Device tempSensor = new Device("Temperature Sensor", 5000);
            Device securityCam = new Device("Security Camera", 3000);
            Device lightCtrl = new Device("Light Controller", 4000);
            Device doorLock = new Device("Door Lock Monitor", 6000);

            Thread t1 = new Thread(securityCam);
            Thread t2 = new Thread(tempSensor);
            Thread t3 = new Thread(lightCtrl);
            Thread t4 = new Thread(doorLock);

            t1.setName("SecurityThread");
            t2.setName("TempThread");
            t3.setName("LightThread");
            t4.setName("DoorThread");

            t1.setPriority(10);
            t2.setPriority(7);
            t3.setPriority(5);
            t4.setPriority(5);

            t1.start();
            t2.start();
            t3.start();
            t4.start();

            try {
                t1.join();
                t2.join();
                t3.join();
                t4.join();
            } catch (InterruptedException e) {
                System.out.println("Main Interrupted");
            }

            System.out.println("All devices completed execution.");
        }
    }
class Main1 {
    public static void main(String[] args) {

        BankAccount premiumUser = new BankAccount("Krishna", "Premium");
        BankAccount regularUser = new BankAccount("Rahul", "Regular");
        BankAccount basicUser = new BankAccount("Aman", "Basic");

        Thread t1 = new Thread(premiumUser);
        Thread t2 = new Thread(regularUser);
        Thread t3 = new Thread(basicUser);

        t1.setName("User-1");
        t2.setName("User-2");
        t3.setName("User-3");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
class Main2 {
        public static void main(String[] args) {

            Order o1 = new Order(101, "Dominos", 3, "Express");
            Order o2 = new Order(102, "KFC", 5, "Standard");
            Order o3 = new Order(103, "Burger King", 4, "Economy");
            Order o4 = new Order(104, "Pizza Hut", 2, "Express");
            Order o5 = new Order(105, "McDonalds", 6, "Standard");

            Thread t1 = new Thread(o1, "Agent-1");
            Thread t2 = new Thread(o2, "Agent-2");
            Thread t3 = new Thread(o3, "Agent-3");
            Thread t4 = new Thread(o4, "Agent-4");
            Thread t5 = new Thread(o5, "Agent-5");

            t1.setPriority(10);
            t2.setPriority(5);
            t3.setPriority(3);
            t4.setPriority(10);
            t5.setPriority(5);

            t1.start();
            t2.start();
            t3.start();
            t4.start();
            t5.start();
        }
    }
class Main3 {
    public static void main(String[] args) {

        Thread entryThread = new Thread(new StudentEntry(), "EntryThread");
        Thread paperThread = new Thread(new QuestionPaper(), "PaperThread");
        Thread attendanceThread = new Thread(new Attendance(), "AttendanceThread");
        Thread collectionThread = new Thread(new AnswerSheet(), "CollectionThread");

        paperThread.setPriority(10);
        attendanceThread.setPriority(8);
        collectionThread.setPriority(7);
        entryThread.setPriority(5);

        System.out.println("Before Start States:");
        System.out.println(entryThread.getName() + " : " + entryThread.getState());
        System.out.println(paperThread.getName() + " : " + paperThread.getState());
        System.out.println(attendanceThread.getName() + " : " + attendanceThread.getState());
        System.out.println(collectionThread.getName() + " : " + collectionThread.getState());

        entryThread.start();
        paperThread.start();
        attendanceThread.start();
        collectionThread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}

        System.out.println("\nAfter Start States:");
        System.out.println(entryThread.getName() + " : " + entryThread.getState());
        System.out.println(paperThread.getName() + " : " + paperThread.getState());
        System.out.println(attendanceThread.getName() + " : " + attendanceThread.getState());
        System.out.println(collectionThread.getName() + " : " + collectionThread.getState());

        try {
            entryThread.join();
            paperThread.join();
            attendanceThread.join();
            collectionThread.join();
        } catch (InterruptedException e) {}

        System.out.println("\nFinal States:");
        System.out.println(entryThread.getName() + " : " + entryThread.getState());
        System.out.println(paperThread.getName() + " : " + paperThread.getState());
        System.out.println(attendanceThread.getName() + " : " + attendanceThread.getState());
        System.out.println(collectionThread.getName() + " : " + collectionThread.getState());

        System.out.println("\nAll activities completed.");
    }
}
class Main4 {
    public static void main(String[] args) throws Exception {

        Ticket[] tickets = new Ticket[10];

        tickets[0] = new Ticket(1, "Critical Bug", 10, 1);
        tickets[1] = new Ticket(2, "Feature Request", 4, 5);
        tickets[2] = new Ticket(3, "General Query", 2, 7);
        tickets[3] = new Ticket(4, "Feedback", 1, 10);
        tickets[4] = new Ticket(5, "Critical Bug", 10, 2);
        tickets[5] = new Ticket(6, "Feature Request", 4, 6);
        tickets[6] = new Ticket(7, "General Query", 2, 8);
        tickets[7] = new Ticket(8, "Feedback", 1, 9);
        tickets[8] = new Ticket(9, "Critical Bug", 10, 3);
        tickets[9] = new Ticket(10, "Feature Request", 4, 4);

        for (int i = 0; i < tickets.length; i++) {
            tickets[i].setName("Agent-" + (i + 1));
            tickets[i].setPriority(tickets[i].priority);
        }

        long globalStart = System.currentTimeMillis();

        for (Ticket t : tickets) t.start();
        for (Ticket t : tickets) t.join();

        long globalEnd = System.currentTimeMillis();

        System.out.println("\nTotal Processing Time: " +
                (globalEnd - globalStart) / 1000 + " sec");

        printAverage("Priority 10", Ticket.p10);
        printAverage("Priority 4", Ticket.p4);
        printAverage("Priority 2", Ticket.p2);
        printAverage("Priority 1", Ticket.p1);
    }

    static void printAverage(String label, List<Long> list) {
        if (list.size() == 0) return;
        long sum = 0;
        for (long t : list) sum += t;
        System.out.println(label + " Average Time: " + (sum / list.size()) + " sec");
    }
}
