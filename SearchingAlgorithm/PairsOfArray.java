package SearchingAlgorithm;

public class PairsOfArray {
    public static void pairs( int arr[]){
        int total_pair=0;
        for(int i=0;i<arr.length;i++){
            int current_value=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+current_value+","+arr[j]+") ");
                total_pair++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs:- "+total_pair);

    }
    public static void main(String[] args) {
        int arr[]={ 3,2,7,4,9,0};
        pairs(arr);
    }
    
}
