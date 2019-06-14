class Demo{
    int a1,b1;
    Demo(){
        a1=90;
        b1=80;
    }
    public String toString(){
        return "a is "+a1+" b is "+b1;
    }
    public static void main(String args[]) {
        Demo d =new Demo();
        System.out.println(d);
    }
}