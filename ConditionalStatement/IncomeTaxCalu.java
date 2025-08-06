import java.util.Scanner;

public class IncomeTaxCalu {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your income:-");
        int income= sc.nextInt();
        if ( income< 500000){
            int tax=0;
            System.out.println("No need to pay TAX");
        }
        else if(income>500000 && income<=1000000){
            int tax= income*10/100;
            System.out.println("You need to pay TAX:-"+tax);
        }
        else{
            int tax= income*30/100;
            System.out.println("You need to pay TAX:-"+tax);
        }
        sc.close();
    }
    
}
