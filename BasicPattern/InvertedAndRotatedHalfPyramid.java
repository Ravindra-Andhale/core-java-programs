package BasicPattern;

public class InvertedAndRotatedHalfPyramid {
    public static void rotatedHalfPyramid( int n){
        // for next line
        for( int i=1; i<=n;i++){
            // for spaces
            for( int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // for stars
            for( int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        rotatedHalfPyramid(4);
    }
    
}

