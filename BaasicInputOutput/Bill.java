import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the cost of pencil:");
    int pencil=sc.nextInt();
    System.out.print("Enter the cost of eraser:");
    int eraser=sc.nextInt();
    System.out.print("Enter the cost of pen:");
    int pen=sc.nextInt();
    float totalCost=pencil+eraser+pen;
        float gst=totalCost *18/100;
        float finalCost=totalCost+ gst;
        System.out.println("Total Cost is:-"+ totalCost);
        System.out.println("GST is:-"+ gst);
        System.out.println("----------------------------------");
        System.out.println("Final Cost is:-"+ finalCost);
    sc.close();

}
}