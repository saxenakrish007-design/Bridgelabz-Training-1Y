import java.util.Scanner;
class PerimeterOfRectangle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length=");
        int a=sc.nextInt();
        System.out.println("Enter Width=");
        int b=sc.nextInt();
        int Perimeter, length=a, width=b;
        Perimeter=2*(a+b);
        System.out.println("Perimeter of Rectangle= "+Perimeter);
    }
}