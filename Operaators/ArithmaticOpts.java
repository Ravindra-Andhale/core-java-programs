public class ArithmaticOpts {
     public static void main(String[] args) {

        int a=10;
        int b=20;
            // Atithmetic Operations
            System.out.println( "add is:-"+(a+b));
            System.out.println("sub is:-"+(b-a));
            System.out.println("Div is:-"+(b/a));
            System.out.println("mult is:-"+(a*b));
            System.out.println("Mod is:-"+(a%b));

            // Unary Operations
            System.out.println("post increment:-"+(b++));  
            System.out.println("pre increment:-"+(++a));
            System.out.println(b);
            System.out.println("post decrement:-"+(b--));
            System.out.println("pre decrement:-"+(--a));
            System.out.println(b);
        }
    }