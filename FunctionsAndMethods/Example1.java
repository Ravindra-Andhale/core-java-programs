package FunctionsAndMethods;

import java.util.Scanner;

public class Example1 {

    public static int sumLastDigit( int a)
{
    int sum=0;
    
    while(a>0){
        int lastDigit=a%10;
    sum=sum+lastDigit;
    a=a/10;
   
    }
    return sum;
    
}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number a:-");
        int digit= sc.nextInt();

        System.out.println("Sum of last digit is:-"+sumLastDigit(digit));
        sc.close();

    }
    
}
