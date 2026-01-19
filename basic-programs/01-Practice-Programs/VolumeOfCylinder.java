import java.util.Scanner;
class VolumeOfCylinder{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius of Cylinder:");
        double a=sc.nextDouble();
        System.out.println("Enter Height of Cylinder");
        double b=sc.nextDouble();
        double Volume ,radius=a,height=b;
        Volume = Math.PI*a*a*b;
        System.out.println("Volume of Cylinder = "+Volume);
    }
}