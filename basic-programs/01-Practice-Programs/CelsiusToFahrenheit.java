import java.util.Scanner;
class CelsiusToFahrenheit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The temperature in Celsius: ");
        int Celsius=sc.nextInt();

        int Fahrenheit = (Celsius * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit :"+Fahrenheit);
    }
}