public class Pettern2 {
    public static void main(String[] args) {
        int n=4;
        int m=5;
      int  a=10;
        //outer Loop
         for (int i=1;i<=4;i++){
             //Inner Loop
             for(int j=1;j<=m;j++){

                 if (i==1|| i==n|| j==1||j==m){
                     System.out.print("* ");
                 }
                 else{
                     System.out.print("  ");
                 }

             }
             System.out.println();
         }
    }
}
