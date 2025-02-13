import java.util.Scanner;

public class StringProgram4StringBuilder {
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your String:");
        String name=sc.nextLine();
        String reversed=new StringBuilder(name).reverse().toString();
        System.out.println("reverse Print: " + reversed);

    }
}
