package com.gla.Threads;
    class Device implements Runnable {
        private String deviceName;
        private int interval;
        public Device(String name, int interval) {
            this.deviceName = name;
            this.interval = interval;
        }
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(
                        Thread.currentThread().getName() + " - " + deviceName +
                                " running at " + java.time.LocalTime.now() +
                                " [Priority: " + Thread.currentThread().getPriority() + "]"
                );

                try {
                    Thread.sleep(interval);
                } catch (InterruptedException e) {
                    System.out.println("Interrupted");
                }
            }
        }
    }



