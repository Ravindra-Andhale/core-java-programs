import java.util.Scanner;
public class Multiplication{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter number a:-");
        int a=sc.nextInt();
         System.out.println("Enter number b:-");
        int b= sc.nextInt();
        int mul= a*b;
        System.out.println(mul);
    sc.close();
    }
}