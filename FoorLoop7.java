public class FoorLoop7 {
    public static void main(String args[])
    {
        int i,j,z=16;
        for(i=1;i<=z;i++){

            for(j=1;j<=i;j++){
                System.out.print(j+"\t");
            }
            for(int k=z;k>=i;k--){
                System.out.print(" ");
            }
            System.out.println();
          }

        for(i=z;i>=1;i--){

            for(j=1;j<=i;j++){
                System.out.print(j+"\t");
            }
            for(int k=z;k>=i;k--){
                System.out.print(" ");
            }
            System.out.println();
        }


    }
    }
