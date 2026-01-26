import java.util.Scanner;
class LargestOf3Numbers{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    if (a > b && a > c) {
            System.out.println("Is the first number the largest? Yes");
        } else {
            System.out.println("Is the first number the largest? No");
        }
        if (b > a && b > c) {
            System.out.println("Is the second number the largest? Yes");
        } else {
            System.out.println("Is the second number the largest? No");
        }
        if (c > a && c > b) {
            System.out.println("Is the third number the largest? Yes");
        } else {
            System.out.println("Is the third number the largest? No");
        }
    }
}