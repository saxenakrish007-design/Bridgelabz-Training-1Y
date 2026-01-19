import java.util.Scanner;
class PowerCalculation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Base:");
        int a=sc.nextInt();
        System.out.println("Enter Exponent:");
        int b=sc.nextInt();
        int result=1;
        int base=a;
        int exponent=b;
        for(int i=1;i<=b;i++){
            result=result*a;
        }
        System.out.println("Power Calculation="+result);
    }
}