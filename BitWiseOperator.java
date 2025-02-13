public class BitWiseOperator {
    public static void main(String args[]){
        int a=10 & 7;
        System.out.println(a);

        int bb=10 & 8;
        System.out.println(bb);
    }
}


////solve
//10 = 1010
//7 =  0111
//ans= 0010 =2

//And
//a  b   o/p
//1  0    0
//1  1    1
//0  0    0
//0  1    0