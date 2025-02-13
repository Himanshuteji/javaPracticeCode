import java.util.Scanner;

public class StringProgram4ReversePrint {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your String: ");
        String name=sc.nextLine();
        String reverseString="";
        for(int i=name.length()-1;i>=0;i--){
            reverseString +=name.charAt(i);
        }
        System.out.println(reverseString);
    }
}
