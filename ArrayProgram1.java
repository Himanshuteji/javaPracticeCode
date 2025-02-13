import java.util.Arrays;

public class ArrayProgram1 {
    static int getSL(int a[]){
        int n=a.length;
        Arrays.sort(a);
        for(int i=n-2;i >=0;i--){
            if(a[i]!=a[n-1]){
                return a[i];
            }
        }
    return -1;
    }

    public static void main(String args[]){
        int arr[]={10,3,4,30,70,6,1};
        System.out.println("Second Largest: "+ getSL(arr));
    }
}
