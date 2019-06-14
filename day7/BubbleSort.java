class BubbleSort{
    public static void main(String[] args){
        int arr[]={6,5,3,2,4};
        BubbleSort s=new BubbleSort();
        s.bubbleSort(arr);
        s.disp(arr);

    }
    void bubbleSort(int arr[]){
        int l=arr.length-1;
        for(int i=0;i<l;i++){
            for(int j=0;j<l-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    void disp(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}