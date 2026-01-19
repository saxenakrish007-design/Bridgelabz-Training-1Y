import java.util.Scanner;
class SimpleInterest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principal : ");
          double a=sc.nextDouble();
          System.out.println("Enter Rate : ");
          double b=sc.nextDouble();
          System.out.println("Enter Time : ");
          double c=sc.nextDouble();
          double SimpleInterest , principal=a, rate=b , time=c;
          SimpleInterest = (a * b * c) / 100; 
          System.out.println("Simple Interest= "+SimpleInterest);       
    }
}