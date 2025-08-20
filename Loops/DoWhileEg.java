package Loops;

import java.util.Scanner;

public class DoWhileEg {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        

        do{
            System.out.print("Enter a value of a:-");
        int a = sc.nextInt();
        
            if(a%10==0){
                continue;
            }
            System.out.println("Not a multiple of 10:-"+a);
          sc.close();  
        }while(true);
       
    }
}



