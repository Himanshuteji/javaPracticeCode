public class Array {

    public static void main(String args[]){
        int ages[]={10,20,40,50,60,70};
        int length=ages.length;
        float avg,sum=0;
        for(int i=0;i<ages.length;i++){
            sum =sum+ages[i];
        }
        System.out.println("avg is: "+ sum/length);
    }

}
