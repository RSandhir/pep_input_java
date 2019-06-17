class ArraySizeException extends Exception{
    ArraySizeException(String s){
        super(s);
    }
}
class ArrayAdd1{
    public static void main(String[] args){
        int a[]={1,2,3,4,5};
        int b[]={1,2,3,4};
        int c[]={5,4,3,2,1};
        System.out.println("A+B="+sumArr(a,b));
        System.out.println("A+c="+sumArr(a,c));
    }
    static int[] sumArr(int a[],int b[]){
        int c[]=new int[a.length];
        try{
        if(a.length!=b.length){
            throw new ArraySizeException("Different size");
        }
        else{
            for(int i=0;i<a.length;i++)
            c[i]=a[i]+b[i];
            return c;
        }
        
    }
    catch(ArraySizeException e){
        System.out.println("Err:"+e.getMessage());
        return c;
    }
    }
}