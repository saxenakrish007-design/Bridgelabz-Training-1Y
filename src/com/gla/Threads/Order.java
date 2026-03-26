package com.gla.Threads;
    class Order implements Runnable {
        private int orderId;
        private String restaurantName;
        private int deliveryTime;
        private String deliveryType;

        public Order(int orderId, String restaurantName, int deliveryTime, String deliveryType) {
            this.orderId = orderId;
            this.restaurantName = restaurantName;
            this.deliveryTime = deliveryTime;
            this.deliveryType = deliveryType;
        }

        @Override
        public void run() {
            long startTime = System.currentTimeMillis();

            System.out.println(Thread.currentThread().getName() + " picked up Order " + orderId +
                    " from " + restaurantName + " (" + deliveryType + ")");

            try {
                System.out.println(Thread.currentThread().getName() + " Order " + orderId + " is In Transit");
                Thread.sleep(deliveryTime * 1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }

            System.out.println(Thread.currentThread().getName() + " delivered Order " + orderId);

            long endTime = System.currentTimeMillis();
            System.out.println("Order " + orderId + " Total Delivery Time: " +
                    (endTime - startTime) / 1000 + " seconds");
        }
    }

