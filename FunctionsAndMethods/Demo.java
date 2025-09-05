package FunctionsAndMethods;

import java.util.Scanner;

public class Demo {

    public static void Hello(){
        System.out.println("Hello Ravindra");
    }

    public static int calculateSum(int num1, int num2){
        
        int sum=num1+num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

       // Hello();
        int sum=calculateSum(a, b);
        System.out.println("Sum is:-"+sum);
        sc.close();
    }
    
}
