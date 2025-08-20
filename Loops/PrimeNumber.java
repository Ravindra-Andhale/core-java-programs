package Loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number;-");
        int num=sc.nextInt();
        boolean isPrime= true;
        if(num==2){
            System.out.println("Is prime Number");
        }
           
        for( int i=2;i<=(num-1); i++ ){
            if (num%i==0){
                isPrime= false;
            }
        }

        if(isPrime== true){
            System.out.println("Is prime Number");
        }else{
            System.out.println("Is not prime Number");
        }
      
        sc.close();
    }
    
}
