//Write a Java program that takes a year from the user and print whether that year is a leap year or not.

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Year:-");
        int year=sc.nextInt();
        if (year%4==0 && year%100!=0 || year% 400==0 )
        System.out.println("Leap year");
        else
        System.out.println("Not a leap Year");
         
        sc.close();
    }
    
}
