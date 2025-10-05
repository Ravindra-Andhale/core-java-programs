package BasicPattern;

public class PalindromicPyramid {
    public static void palindromicPyramid(int n){
        for(int i=1;i<=n;i++){
            // for spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.err.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        palindromicPyramid(7);
    }
    
}
