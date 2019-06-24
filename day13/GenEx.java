class ExGen<T,U>{
    T ob;
    U ob1;
    void add(T ob,U ob1){
        this.ob=ob;
        this.ob1=ob1;
    }
    T getKey(){
        return this.ob;
    } 
    U getVal(){
        return this.ob1;
    }
    void showTypes(){
        System.out.println(ob.getClass().getName());
        System.out.println(ob1.getClass().getName());
    }
}
class GenEx{
    public static void main(String[] args){
        ExGen<Integer,String> g1=new ExGen<>();
        g1.add(1,"hi");
        g1.showTypes();
        System.out.println("Key:"+g1.getKey()+" Value:"+g1.getVal());
        ExGen<String,Integer> g2=new ExGen<>();
        g2.add("hello",1);
        g2.showTypes();
        System.out.println("Key:"+g2.getKey()+" Value:"+g2.getVal());
    }
}