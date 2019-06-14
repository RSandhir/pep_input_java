class DupArr{
    public static void main(String args[]) {
        int arr[]={1,2,3,4,3,2,3,1};
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count+=1;
                }
            }
            if(count!=0){
                arr[i]=-1;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=-1)
            System.out.print(" "+arr[i]);
        }
    }
}