//Write a program to cheack that the given value is a leap year or not

public class IfOuestion1 {
    public static void main(String [] args) {
        int a = 2023;
        if (a%400==0){
            System.out.println("leap year hai ");
        }
        else if (a%4==0){
            System.out.println("Non-leap year");
        }
        else if (a%100==0){
            System.out.println("leap year hai ");
        }
        else{
            System.out.println("Non-leap year");
        }
    }

}



