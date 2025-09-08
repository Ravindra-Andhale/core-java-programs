package FunctionsAndMethods;

public class PalindromeNumber {

    public static void palinNum( int n){
        int myNum=n;
         int revNum=0;
         while( n>0){

            int lastdigit=n%10;
            int rev=revNum*10+lastdigit;
            n=n/10;
            revNum=rev;

         }
         if ( myNum==revNum){
            System.out.println(myNum+" is a palindrome Number");
         }
         else{
            System.out.println(myNum+" is not a palindrome number");
         }


    }
    public static void main(String[] args) {
        palinNum(99);
        
    }
    
}
