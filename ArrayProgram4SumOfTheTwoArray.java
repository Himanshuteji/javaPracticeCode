import java.util.Scanner;

public class ArrayProgram4SumOfTheTwoArray {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array 1: ");
        int size1=sc.nextInt();

        System.out.println("Enter the size or array 2:");
        int size2=sc.nextInt();

        if(size1 != size2){
            System.out.println("same size ka array dalo ");
        }

        int[] arr1=new int[size1];
        int [] arr2=new int[size2];

        System.out.println("Enter the array1 element :");
        for(int i=0;i<size1;i++){
            arr1[i]=sc.nextInt();
        }

        System.out.println("Enter the array2 element :");
        for(int i=0;i<size2;i++){
            arr2[i]=sc.nextInt();
        }

        int [] sumArray=new int[size1];
        for(int i=0;i<arr1.length;i++){
            sumArray[i]=arr1[i] + arr2[i];
        }

//        System.out.println(Arrays.toString(sumArray));

        System.out.println("Sum of array");
        for(int i=0;i<sumArray.length;i++){
            System.out.print(sumArray[i]+" ");
        }

    }
}
