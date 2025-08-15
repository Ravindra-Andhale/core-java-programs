import java.util.Scanner;
public class Example1 {
    //Write a Java program to get a number from the user and print whether it is positive or negative
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number:-");
        int number=sc.nextInt();
        if(number>0){
            System.out.println("Posetive");
        }
        else
        {
            System.out.println("Negative");
        }
        sc.close();
     }

    
}
