import java.util.Scanner;

public class ArrayProgram3 {
    static int missing(int arr[],int n,int arrsum){

        int sum=n*(n+1)/2;
        for(int i=0;i<n;i++){
            arrsum +=arr[i];
        }
        return sum-arrsum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter the size of the array: ");
        int n=sc.nextInt();

        if (n <= 1) {
            System.out.println("Please enter a valid value for n (greater than 1).");
            return;
        }

        int size=n+1;
        int arr[]=new int[n];
        System.out.println("Enter the element of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int arrsum=0;
       int a= missing(arr,n,arrsum);
    System.out.println("missing element :"+a);
    sc.close();
    }
}
