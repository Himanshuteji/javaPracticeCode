
//write a program to cheak the given number is armstrong or not

public class WhileLoop12 {
    public static void main(String[] args) {
        int n=153, r, sum =0 , temp=n;
        while(n!=0){
            r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        if (sum==temp){
            System.out.println("arm strong number");
        }
        else{
            System.out.println("not");
        }
    }
}
