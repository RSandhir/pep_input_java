class A{
    static void meth(){
        System.out.println("A meth");
    }
}
class B extends A{
    static void meth(){
        System.out.println("B meth");
    }
}
class StaticOvrld{
    public static void main(String[] args) {
        B ob=new B();
        A ob1=new A();
        ob.meth();
        //ob1.meth();
    }
}