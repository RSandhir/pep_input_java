class A{
    int x; A(){
        x=10;
        System.out.println("A Constructor");
    }
}
class B extends A{
    int y; B(){
        y=20;
        System.out.println("B Constructor");
    }
}
class InheritEx{
    public static void main(String args[]){
        B ob =new B();
        System.out.println(ob.x+" "+ob.y);
    }
}