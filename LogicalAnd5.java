public class LogicalAnd5 {
    public static void main(String[] args) {
        int a=10 , b=10 , c=10 ;
        boolean x;
        x =++a==b++ && b++ == c++;
        System.out.println(a+" "+b+" "+c);
        System.out.println(x);

    }
}

//Logical And (&&) me ager kabhi bhi phli condition false hoti hai toh sort
//        circuit ho jata hai , or out bhi vahi atta hai