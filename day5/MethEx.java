class A{
    int x=10;
    void meth(){
        System.out.println("A meth");
    }
}
class B extends A{
    int x=20;
    int y=30;
    void meth(){
        System.out.println("B meth1");
    }
    void meth2(){
        System.out.println("B meth2");
    }
}
class  MethEx{
    public static void main(String[] args) {
        A ob=new B();
        ob.meth();
        ob.meth2();
        System.out.println(ob.x);
        System.out.println(ob.y);
    }
}