
//write a program to cheak the given numver is parlindrone or not

public class WhileLoop11 {
public static void main(String[]args){
    int n=151 ,r,sum=0,temp=0;
    while(n!=0){
        r=n%10;
        sum=sum*10+r;
        n=n/10;
    }
    if (sum==temp){
        System.out.println("polindrome");
    }
    else{
        System.out.println("not a polindrome");
    }
}
}
