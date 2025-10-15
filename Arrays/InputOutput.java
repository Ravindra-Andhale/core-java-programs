package Arrays;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        
        int marks[] = new int[100];

        Scanner sc= new Scanner(System.in);

        marks[0]= sc.nextInt();
        marks[1]= sc.nextInt();
        marks[2]= sc.nextInt();
        marks[3]= sc.nextInt();
        

        System.out.println("Math:-"+marks[0]);
        System.out.println("Sci:-"+marks[1]);
        System.out.println("Phy:-"+marks[2]);
        System.out.println("Che:-"+marks[3]);
        sc.close();
    }
    
}
