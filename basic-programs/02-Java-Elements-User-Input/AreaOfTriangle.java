import java.util.Scanner;
class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base in cm: ");
        double base = sc.nextDouble();
        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();
        double areaSqCm = 0.5 * base * height;
        double baseInches = base / 2.54;
        double heightInches = height / 2.54;
        double areaSqIn = 0.5 * baseInches * heightInches;
        System.out.println("The Area of the triangle in sq in is " 
                + areaSqIn + " and sq cm is " + areaSqCm);
    }
}
