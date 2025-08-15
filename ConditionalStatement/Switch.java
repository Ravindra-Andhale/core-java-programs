import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:-");
        int number= sc.nextInt();
        switch(number){
            
            case 1:
            System.out.println("one");
            break;

            case 2:
            System.out.println("Two");
            break;

            case 3:
            System.out.println("Three");
            break;

            default:
            System.out.println("Number is not Valid");

        }
        sc.close();
    }
}
