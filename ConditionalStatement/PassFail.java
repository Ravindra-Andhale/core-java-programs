import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your marks:-");
        int marks= sc.nextInt();
        
        String result=marks>=35? "Pass": "Fail";
        System.out.println(result);
        sc.close();
    
    }   
}
