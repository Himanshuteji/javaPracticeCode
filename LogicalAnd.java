public class LogicalAnd {
    public static void main(String[] args) {
        int a=10 , b=10 , c=10;
        boolean x ;
        x=a==b && b==c;
        System.out.println(a+" "+b+" "+c);
        System.out.println(x);
    }
}
//Is code ke logical ki erroe ko solve krne ke liye LogicalAnd ka use kiya hai (&&)


//public class BooleanTest1 {
//    // Interview type Question
//    public static void main(String[] args) {
//        int a=10, b=10 , c=10;
//        boolean x ;
//        x= a==b==c;     error line
//        System.out.println();

//    }
//}


// output : Error ayegi
//       why ?
//a==b==c;
//10==10 is true , (a==b)
//true == 10 error , ( true==10)