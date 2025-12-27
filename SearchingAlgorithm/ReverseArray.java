package SearchingAlgorithm;

public class ReverseArray {
    public static void reverseArray ( int numbers[]){
        int start=0;;
        int end=numbers.length-1;
        while(start<end){
            int  temp=numbers[end];
            numbers[end]=numbers[start];
            numbers[start]=temp;
         start++;
        end--;      
        } 
    }
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        reverseArray(numbers);
        for( int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
       
        // int n = numbers.length;
       
        /* 
        without using recursion

        // Reverse the array
        for (int i = 0; i < n / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[n - i - 1];
            numbers[n - i - 1] = temp;
        }
        
        // Print the reversed array
        System.out.println("Reversed Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
            */
        
    }
    
}
