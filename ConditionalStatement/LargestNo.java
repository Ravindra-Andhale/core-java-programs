import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number:-");
        int num1= sc.nextInt();

        System.out.print("Enter second Number:-");
        int num2= sc.nextInt();

        System.out.print("Enter third Number:-");
        int num3= sc.nextInt();

        if(num1>=num2 && num1>=num3){
            System.out.print("Largest number is:-"+num1);
        }
        else if( num2>= num1 && num2>=num3){
            System.out.print("Largest number is:-"+num2);
        }
        else{
            System.out.print("Largest number is:-"+num3);
        }
        sc.close();
    
    }
    
}
