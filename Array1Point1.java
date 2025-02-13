import java.util.Scanner;

public class Array1Point1 {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
            System.out.println("Ente");
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }

            int lowestElement=arr[0];

            for(int i=1;i< arr.length;i++){
                if(lowestElement>arr[i]){
                    lowestElement=arr[i];
                }
            }

            System.out.println("Lowest element: "+lowestElement);
    }
}
