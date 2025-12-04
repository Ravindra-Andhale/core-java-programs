package SearchingAlgorithm;

public class LinearSearch {

    public static int linearSearch( int numbers[], int key){
    for( int i=0; i<numbers.length; i++){
        if( numbers[i]== key){
            return i;
        }  
    }
    return -1; // if key will not match with any element in arry

}
    public static void main(String[] args) {
        int [] numbers = { 10, 30, 40, 50 , 20, 70};
        int key=60;
        int index =  linearSearch( numbers, key);
        if( index == -1){
            System.out.println("Key is not found"); 
        }
        else{
            System.out.println("Key is found at index:- "+ index);
        }

    }
    
}
