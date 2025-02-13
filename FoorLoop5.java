class ForLoop5{
    public static void main(String args[]){
        int r=4;
        int c=5;
        for(int i=1;i<=r;i++){
            for(int k=5;k>i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}