package FunctionsAndMethods;

public class BinomialCoefficient {
    public static int fact( int n){
        int f=1;
         for( int i=1;i<=n;i++){
            f=f*i;
         }
         return f;
    }
    public static int binCoe( int n, int r){

        int fact_n=fact(n);
        int fact_r=fact(r);
        int fact_nmr=fact(n-r);
        int binoCoef= fact_n/(fact_r* fact_nmr);
        return binoCoef;
    }
       public static void main(String args[]){
        int r=3;
        int n=5;
        System.out.println("Binomial Coefficient is :-"+binCoe(n,r));
       }
        

    
}
