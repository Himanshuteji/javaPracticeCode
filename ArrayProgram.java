import java.util.Arrays;

public class ArrayProgram {
    static int maxPro(int a[],int x){
        if(x<3){
            return -1;
        }
        Arrays.sort(a)        ;
        return Math.max(a[0]*a[1]*a[x-1],a[x-1]*a[x-2]*a[x-3]);
    }
    public static void main(String args[]){
        int arr[] = {-10, -3, 5, 6, -20};
        int n=arr.length;
        int max=maxPro(arr,n);
        if (max==-1){
            System.out.println("array chhota hai ! please enter vaild array ");
        }
        else{
            System.out.println("Max product is: "+max);
        }
    }
}
