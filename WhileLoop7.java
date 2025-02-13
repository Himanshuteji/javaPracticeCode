//WRite a program to reverse of a given number
public class WhileLoop7 {
    public static void main(String[] args) {
        int n=351,r;
        while(n!=0){
            r=n%10;
            System.out.print(r);
            n=n/10;
        }
    }
}
