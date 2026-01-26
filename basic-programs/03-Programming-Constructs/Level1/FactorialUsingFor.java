import java.util.Scanner;
class FactorialUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Enter a natural number");
        } else {
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.println("Factorial = " + fact);
        }
    }
}
