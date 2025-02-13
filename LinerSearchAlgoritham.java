public class LinerSearchAlgoritham {
    static int serach(int a[], int key, int n){
        for(int i=0;i<n;i++){
            if(a[i]==key){
                return 1;
            }
        }
        return -1;
    }
public static void main (String args[])
{
    int a[] ={10, 29,30,40,50,60,69,70};
    int n=a.length;
    int key=30;

   int index= serach(a,key,n);
   if(index==-1){
       System.out.println("Element not Present in Array.");
   }
   else{
       System.out.println("Element found at index : "+index+ " ,Element "+ key );
   }
}}
