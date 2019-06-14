class ArraysQ{
    public static void main(String args[]) {
        int arr[]={1,2,3,4,5};
        int key=Integer.parseInt(args[0]);
        int found=new ArraysQ().binarySearch(arr,0,arr.length,key);
        System.out.println("At:"+found);
        int found1=new ArraysQ().linearSearch(arr,key,0);
        System.out.println("Linear:"+found1);
}
int linearSearch(int arr[],int key,int i){
    if (arr[i]==key){
        return arr[i];
    }
    else return(linearSearch(arr, key,(i+1)));
}
int binarySearch(int arr[],int low,int up,int key){
    int mid=(low+up)/2;
    if(low<up){
        if(mid==key){
            return mid;
        }
        else if(key>mid){
            return binarySearch(arr, mid+1, up, key);
        }
        else{
           return binarySearch(arr, low, mid-1, key);
        }
    }
    else return -1;
}
}
