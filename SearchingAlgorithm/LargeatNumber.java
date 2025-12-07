

package SearchingAlgorithm;

//import java.util.*;

public class LargeatNumber {
    public static int largestNumber( int numbers []){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for( int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest= numbers[i];
            
            }
            if(numbers[i]<smallest){
                smallest= numbers[i];
        }
         
        }
         System.out.println("smallet value is:-"+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[]={5,1,7,9,10,3,8};
        int largest= largestNumber(numbers);
        System.out.println("Largest number is:- "+ largest);

    }
    
}
