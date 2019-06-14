class Demo{
    int a,b;
    Demo(int a,int b){
        this.a=a;
        this.b=b;
    }
    Demo(){
        this(10,20);
    }
    public static void main(String[] args){
        Demo d1=new Demo(2, 3);
        Demo d2=new Demo();
        System.out.println(d1.a+" "+d1.b);
        System.out.println(d2.a+" "+d2.b);
    }
}