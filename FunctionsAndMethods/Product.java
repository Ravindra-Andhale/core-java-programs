package FunctionsAndMethods;

public class Product {

    public static int multiply(int a, int b){
        int prod= a*b;
        return prod;
    }
    public static void main(String[] args) {
        int  a=10;
        int b=20;
        int result = multiply(a,b);
        System.out.println("Product is :-"+ result);
        
        
    }
    
}
