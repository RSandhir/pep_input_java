class InsertionSort{
    public static void main(String[] args){
        int arr[]={6,5,3,2,4};
        InsertionSort s=new InsertionSort();
        s.insertionSort(arr);
        s.disp(arr);

    }
    void insertionSort(int arr[]){
        
    }
    void disp(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}