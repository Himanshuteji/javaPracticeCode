import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in );
        int n=sc.nextInt();
        int ages[]=new int[n];
        for(int i=0;i<ages.length;i++){
            ages[i]=sc.nextInt();
        }
          Arrays.sort(ages); // asc order main sort kare ga
        System.out.println("sorted array:"+ Arrays.toString(ages));
        System.out.println(ages[0]);
    }
}
