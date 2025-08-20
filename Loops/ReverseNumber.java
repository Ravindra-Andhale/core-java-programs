package Loops;

public class ReverseNumber {
    public static void main(String[] args) {
        int num=23104;
        // Using for loop to reverse the number
       /*  for( int i=0;num>0;i++){
            int lastDigit= num%10;
            System.out.print(lastDigit);
            num=num/10;

        }*/
        // Using while loop to reverse the number
        // int rev=0;
         while( num>0){
                int digit=num%10;
                System.out.print(digit);  // rev=rev*10+digit
                num=num/10;
            }
            // System.out.print(rev);
    }
    
}
