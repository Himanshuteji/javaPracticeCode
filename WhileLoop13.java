//write a program to print all the digit of given no. on seprate line

public class WhileLoop13 {
    public static void main(String[] args) {
        int n=10500, r, sum=0, x=0, count=0, a=n;
        while(a!=0) {
            r = a % 10;
            if (r == 0) {
                count++;
            } else if (r != 0) {
                break;
            }
            a = a / 10;
        }
        while (n != 0) {
            r=n%10;
            x =x*10+r;
            n=n/10;
        }
        while(x!=0){
            r=x%10;
            switch (r){
                case 1: System.out.print(r+" "+"one"); break;
                case 2: System.out.print(r+" "+"two"); break;
                case 3: System.out.print(r+" "+"three"); break;
                case 4: System.out.print(r+" "+"four"); break;
                case 5: System.out.print(r+" "+"five"); break;
                case 6: System.out.print(r+" "+"six"); break;
                case 7: System.out.print(r+" "+"seven"); break;
                case 8: System.out.print(r+" "+"eight"); break;
                case 9: System.out.print(r+" "+"nine"); break;
               case 0: System.out.print(r+" "+"Zero"); break;
            }
            x=x/10;
            if(count>0){
                System.out.println("Zero");
                count--;
            }
            else{
                break;
            }
        }

    }
}
