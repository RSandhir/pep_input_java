class SelectionSort{
    public static void main(String[] args){
        int arr[]={6,5,3,2,4};
        SelectionSort s=new InsertionSort();
        s.selectionSort(arr);
        s.disp(arr);

    }
    void selectionSort(int arr[]){
        int l=arr.length;
        for (int i=0;i<l-1;i++) 
        { 
            int min=i; 
            for (int j=i+1;j<l;j++) 
                if (arr[j] < arr[min]) 
                    min=j;
            int temp=arr[min];
            arr[min]=arr[i]; 
            arr[i]=temp; 
        } 
    }
    void disp(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}