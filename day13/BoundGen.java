class MyClass{}
class A extends MyClass{}
class B extends A{}
class C extends B{}

class GenDemo<T extends MyClass>{
    T ob1;
    GenDemo(T ob1){
        this.ob1=ob1;
    }
    T get(){
        return ob1;
    }
    void showType(){
        System.out.println("Type of T is: "+ob1.getClass().getName());
    }
}
class BoundGen{
    public static void main(String[] args){
        C ob=new C();
        GenDemo<C> gd=new GenDemo<>(ob);
        gd.showType();
    }
}