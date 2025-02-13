public class ArrayProgram2 {
    static int consecutive(boolean a[],int n) {
        int count=0;
        int rs=0;

        for (int i = 0; i <a.length; i++) {
                if(a[i]==true){
                    count=0;
                }
                else{
                    count++;
                    rs=Math.max(rs,count);
                }
        }
        return rs;
    }
    public static void main(String args[]){
        boolean arr[]={true,false, true,true,true, false, true,false,false,false,false,false};
        int n=arr.length;
     int r=   consecutive(arr,n);
        System.out.println(r);
    }
}
