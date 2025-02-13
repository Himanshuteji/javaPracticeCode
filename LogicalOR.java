public class LogicalOR {
    public static void main(String[] args) {
        int a=10 , b=10 , c=10;
        boolean x ,y;
        x=a==b || b==c;
        System.out.println(a+" "+b+" "+c);
        System.out.println(x);

        y=++a==b++|| b++==++c;
        System.out.println(a+" "+b+" "+c);
        System.out.println(y);
    }
}

//logical OR (||) me ager kabhi bhi phle condition True hoti hai
//    toh SHort circuit hota hai or output bhi nhi hota hai