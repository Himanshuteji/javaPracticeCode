import java.util.Scanner;

public class AraayProgram3ReversePrint {
    static void reverse(int arr[]){
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]);
        }
    }
    public static void main(String args[])

    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n=sc.nextInt();
        int arr[]=new int[n];


        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter the element of your array: ");
            arr[i]=sc.nextInt();
        }

        reverse(arr);

    }
}