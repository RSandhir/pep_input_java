//TODO constructor to set memory , add function adds values one by one until capacity is reached
class GenArr<T>{
    T[] arr;
    void add(T arr[]){
        this.arr=arr;
    }
    void display(){
        for(int i=0;i<this.arr.length;i++)
        System.out.println(this.arr[i]);
    }
}
class GenEx{
    public static void main(String[] args){
        Integer[] a={1,2,3,4,5};
        String[] s={"aa","bb","dsds"};
        GenArr<Integer> g1=new GenArr<>();
        g1.add(a);
        g1.display();
        GenArr<String> g2=new GenArr<>();
        g2.add(s);
        g2.display();
    }
}