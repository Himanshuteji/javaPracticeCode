//write a program to calculate the multiple of given indivial no

public class WhileLoop10 {
    public static void main(String[] args) {
        int n =153 , r ,sum=1;
        while(n!=0){
            r=n%10;
            sum=sum*r;
            n=n/10;
        }
        System.out.println(sum);
    }
}
