interface A{
    void meth();
}
class LambdaEx implements A{
    public void meth(){
        System.out.println("Method");
    }
    public static void main(String[] args){
        LambdaEx ob=new LambdaEx();
        ob.meth();
        A o=new A(){
            public void meth(){
                System.out.println("Annonymous");
            }
        };
        o.meth();
        A o3=()->{System.out.println("LambdaExp");};
        o3.meth();
    }
}