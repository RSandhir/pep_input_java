class Gen<T extends Number>{
    <T extends Number>void sortMe(T[] arr){
        int l=arr.length-1;
        for(int i=0;i<l;i++){
            for(int j=0;j<l-i;j++){
                if(arr[j].doubleValue()>arr[j+1].doubleValue()){
                    T temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
class GenSort{
    public static void main(String[] args){
        Integer a[]={4,3,2,5,1};
        new Gen().<Integer>sortMe(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        Double b[]={4.0,3.0,2.1,5.2,1.0};
        new Gen().<Double>sortMe(b);
        for(int i=0;i<a.length;i++){
            System.out.println(b[i]);
        }
    }
}