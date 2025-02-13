public class BubbleSortDSA {
    static void sortArray(int arr[],int n){
        boolean swap ;
        for(int i=0;i<n-1;i++){
            swap = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
    //                    arr[i]=arr[i]+arr[j];
    //                    arr[j]=arr[i]-arr[j];
    //                    arr[i]=arr[i]-arr[j];
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                   swap=true;
                }
            }
            if(swap==false){
                break;
            }
        }

    }
    static void printArray(int arr[],int x){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String args[]){
        int arr[]={9,4,7,2,67,85};
        int n=arr.length;
        sortArray(arr,n);
        System.out.println("Sorted array: ");
        printArray(arr,n);
    }
}
