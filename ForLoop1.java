import java.util.Scanner;
public class ForLoop1 {
    public static void main(String[] args) {
        int i,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        n = sc.nextInt(10);
        for (i = 0; i <=n; i++) {
            System.out.println( "Himanshu teji "+i);
        }
    }
}
