public class SpringSeason {

    // Method to check Spring Season
    public static boolean isSpringSeason(int month, int day) {

        // March 20 to June 20
        if ((month == 3 && day >= 20) ||
                (month == 4) ||
                (month == 5) ||
                (month == 6 && day <= 20)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        // Taking command line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Calling method
        boolean result = isSpringSeason(month, day);

        // Display result
        if (result) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
