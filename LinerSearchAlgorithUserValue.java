import java.util.Scanner;

class LinerSearchAlgorithUserValue{
    static int search(int a[], int key, int n){
        for(int i=0;i<n;i++){
            if (a[i]==key){
                return 1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter"+n+"number");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter search element : ");
        int key=sc.nextInt();

        //call function
        int index= search(a,key,n);

        if(index==key){
            System.out.println("element mil gya hai index:"+index+"Element"+key);
        }
        else{
            System.out.println("Jo element diya hai vo is array main nahi hai ");
        }
    }
}