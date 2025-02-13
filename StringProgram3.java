import java.util.Scanner;

public class StringProgram3 {

    static void  insertString(String str, String addstr, int index){
        String str1="";
        for(int i=0;i<str.length();i++) {
            str1 += str.charAt(i);
            if (i == index) {
            str1 +=addstr;
            }
        }
        System.out.println(str1);
    }

    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the original string: ");
        String str=sc.nextLine();

    System.out.println("Enter the string to insert: ");
        String addstr=sc.nextLine();

    System.out.println("Enter the index to insert at");
    int index=sc.nextInt();

    if(index < 0 || index > str.length()){
    System.out.println("Invalid Index!Please enter a valid index.");
    }
    else{
        insertString(str,addstr,index);
    }

    }
}
