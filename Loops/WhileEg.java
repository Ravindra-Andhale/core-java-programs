package Loops;

// print a number from 1 to n
import java.util.Scanner;

public class WhileEg {
    public static void main(String[] args) {
        int count =1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:-");
        int n=sc.nextInt();

        while(count<=n){
            System.out.println(count);
            count++;
        } 
        sc.close();
    } 
}
