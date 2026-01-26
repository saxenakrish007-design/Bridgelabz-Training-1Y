import java.util.Scanner;
class SmallestOf3Numbers {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    if(a<b&&a<c){
        System.out.println("Is the first number the smallest? Yes");
    }
    else{
        System.out.println("Is the first number the smallest? No");
    }
}    
}
