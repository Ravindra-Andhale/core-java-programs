package FunctionsAndMethods;

public class FunctionOverlodingBasic {

    // sum of two numbers
    public static int sum(int a, int b){
        return a+b;
    }
    // sum of three numbers
    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static int mul(int x, int y){
        return x*y;
    }
    public static float mul( float x, float y){
        return x*y;
    }
    public static void main(String[] args) {

        System.out.println(sum(2,4));
        System.out.println(sum(2,6,1));
        System.out.println(mul(2,6));
        System.out.println(mul(2.4f, 3.6f));

    }
    
}
