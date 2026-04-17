package com.gla.Stream_api;
    import java.util.*;
import java.util.function.Predicate;
    class Alert {
        String message;
        String type; // critical, normal, reminder

        Alert(String message, String type) {
            this.message = message;
            this.type = type;
        }

        public String toString() {
            return type.toUpperCase() + " : " + message;
        }
    }

    class NotificationFilter {
        public static void main(String[] args) {

            List<Alert> alerts = new ArrayList<>();

            alerts.add(new Alert("Heart rate abnormal", "critical"));
            alerts.add(new Alert("Time for medicine", "reminder"));
            alerts.add(new Alert("Routine checkup due", "normal"));
            alerts.add(new Alert("Blood pressure high", "critical"));

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter preference (critical/normal/reminder): ");
            String choice = sc.nextLine().toLowerCase();
            Predicate<Alert> filter = a -> a.type.equals(choice);

            System.out.println("\nFiltered Alerts:");
            for (Alert a : alerts) {
                if (filter.test(a)) {
                    System.out.println(a);
                }
            }

            sc.close();
        }
    }