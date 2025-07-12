import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pi=3.14f;
         System.out.println("Enter value of radius :-");
        float rad=sc.nextFloat();
        double area=pi*rad*rad;
        System.out.println(area);
         
        sc.close();
    }
}
