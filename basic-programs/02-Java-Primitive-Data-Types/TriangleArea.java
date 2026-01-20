import java.util.Scanner;
class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base in inches: ");
        double base = sc.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = sc.nextDouble();
        double areaSqInches = 0.5 * base * height;
        double areaSqCm = areaSqInches * 6.4516;
        System.out.println("The area of the triangle is "
         + areaSqInches +" square inches and "
          + areaSqCm + " square centimeters");
    }
}
