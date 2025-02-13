public class BinarySearchAlgoritham {
    static int search (int a[] , int st ,  int l , int x){
    while(st<=l){
        int mid=st+(l-st)/2;
        if(a[mid]>x){
            l=mid-1;
        }else if(a[mid]<x){
            st=mid+1;
        }else if(a[mid]==x) {
            return mid;
        }
    }
    return -1;
    }
    public static void main(String args[]){



        BinarySearchAlgoritham obj=new BinarySearchAlgoritham() ;
        int a[]={1,3,5,7,9,11};
        int length=a.length;
        int key=9;

        int res=obj.search(a,0,length-1,key);
        if(res==-1){
            System.out.println("Element not represent inarray. ");
        }
        else{
            System.out.println("Element present in "+res+" index");
        }
    }
}
