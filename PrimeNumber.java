
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number" +
                " to check if it is a prime number");
        int n = sc.nextInt();
        boolean f=false;
        for (int i=2;i<(n/2);i++){
            if(n%i==0){
                f=true;
                break;
            }
        }
        if(f==true){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime Number");
        }
    }
}
