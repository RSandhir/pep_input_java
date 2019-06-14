class A{
    int x;
    A(int x){
        this.x=x;
    }
}
class B extends A{
    int y;
    B(int y){
        super(30);
        this.y=y;
    }
}
class C extends B{
    int z;
    C(int z){
        super(20);
        this.z=z;
    }
}
class Test{
    public static void main(String[] args) {
        C ob=new C(10);
        System.out.println(ob.x+" "+ob.y+" "+ob.z);
    }
}