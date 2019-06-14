abstract class A{
    int x,y;
    A(int x,int y){
        this.x=x;
        this.y=y;
    }
    int meth1(){
        return x+y;
    }
    public abstract void meth2();
    abstract meth3();
}
class B extends B{
    int z;
    B(int z){
        super(2,3);
        this.z=z;
    }
    void meth4(){
        System.out.println("Meth 4");
    }
    public void meth2(){
        System.out.println("Meth 2");
    }
}
class C {
    public static void mian(String[] args) {
        B ob=new B(2);
        ob.meth2();
        ob.meth4();
    }
}