interface A{
    void meth();
}
interface B{
    void meth2();
}
abstract class C{
    abstract void meth3();
    void meth4(){
        System.out.println("Hello meth4");
    }
}
class InterEx{
    public static void main(String[] args) {
        A ob=new A(){
            public void meth(){
                System.out.println("Anonymous imp of meth");
            }
        };
    }
}