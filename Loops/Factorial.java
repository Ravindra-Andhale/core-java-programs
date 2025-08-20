package Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int fact=1;
        System.out.println("Enter a number to find its factorial:");
        num=sc.nextInt();
        for( int i=1;i<=num; i++){
            fact=fact*i;
        }
        System.out.println("Fact of:-"+ num +" is:-"+fact);
        sc.close();
    }
}