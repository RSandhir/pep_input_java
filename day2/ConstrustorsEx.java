class ConstructorsEx{
    int a;
    double d;
    ConstructorsEx(){
        a=10;
        d=20.0;
        System.out.println("Non parameterized");
    }
    ConstructorsEx(int x,double y){
        a=x;
        d=y;
        System.out.println("PArametirized");
    }
    public static void main(String[] args) {
        ConstructorsEx ob1=new ConstructorsEx();
        ConstructorsEx ob2=new ConstructorsEx(1,1.5);
        System.out.println(ob1.a+" "+ob1.d);
        System.out.println(ob2.a+" "+ob2.d);
    }
}