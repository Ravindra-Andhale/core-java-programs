package FunctionsAndMethods;
import java.util.Scanner;
public class PrimeNumber {
    public static boolean isPrime(int num){
        boolean isPrime=true;
        if( num==2){
            return true;
        }
        for( int i=2;i<=num-1;i++){
            if ( num%i==0){
                isPrime=false;
            }
        } 
        return isPrime;
    } 

        public static void primeRange( int n){
            for( int i=2;i<=n;i++){
                if(isPrime(i)){
                    System.out.println(i);
                }
            }
        }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        //System.out.println(isPrime(n));
        primeRange(n);
        
       sc.close();

    }

    
}
