package Loops;

import java.util.Scanner;

public class SumOfNatural {  
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter a number:- ");
        int num= sc.nextInt();
        int count=1;
        int sum=0;
        while(count <=num){
            sum =sum + count;
            count++;
        }
       
        sc.close();
    }
    
}
