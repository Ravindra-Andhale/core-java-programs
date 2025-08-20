package Loops;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        
        int num;
        int choice;
        int evenNum=0;
        int oddNum=0;
        Scanner sc= new Scanner(System.in);

        
        do{
             System.out.println("Enter a number:-");
         num= sc.nextInt();

         if( num%2==0){
            evenNum= evenNum + num;
         }
         else{
            oddNum= oddNum +num;
         }
         System.out.println(" Choose 1 to continue or 0 to exit:");
          choice = sc.nextInt();

        }while(choice==1);

         System.out.println("Sum of even numbers: " + evenNum);
         System.out.println("Sum of odd numbers: " + oddNum);
         sc.close();
    }
    
}
