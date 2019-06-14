class ThisEx{
    int a,b,c;
    ThisEx(){
        this(10);
        System.out.println("not parameterized");
    }
    ThisEx(int a){
        this(a,20);
        System.out.println("1 parameterized");
    }
    ThisEx(int a,int b){
        this(a,b,30);
        System.out.println("2 parameterized");
    }
    ThisEx(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
        System.out.println("3 parameterized");
    }
    public static void main(String[] args){
        ThisEx o1=new ThisEx();
    }
}