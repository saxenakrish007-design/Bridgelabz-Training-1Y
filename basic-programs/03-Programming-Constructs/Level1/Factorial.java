import java.util.Scanner;
class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Enter a positive integer");
        } else {
            int fact = 1;
            int i = 1;
            while (i <= n) {
                fact = fact * i;
                i++;
            }
            System.out.println("Factorial = " + fact);
        }
    }
}
