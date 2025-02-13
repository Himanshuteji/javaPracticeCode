import java.util.Arrays;

public class ArraysProgram {
static int getSL(int a[]) {
    int length = a.length;
    Arrays.sort(a);
    System.out.println(Arrays.toString(a));
    int b = a[(length - 1)/2];
    return b;
}
    public static void main(String args[]){
        int arr[]={10,3,4,30,70,65,1};
        System.out.println("Second Largest: "+ getSL(arr));
    }
}
