package Arrays;

public class FunctionArgument {
   public  static void update( int marks[], int nonChangable){
       nonChangable= 25;
    for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String args[]) {
        int marks []= {89, 78, 90, 91};
       int   nonChangable= 5;
        update(marks, nonChangable);
        System.out.println(nonChangable);
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
    }
    
}
