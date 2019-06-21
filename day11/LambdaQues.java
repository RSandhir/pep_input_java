interface A{
    int returnVal();
}
interface B{
    void printParam(int a);
}
interface C{
    int sum(int a,int b);
}
interface D{
    void printSum(int a,double b);
}
interface E{
    String greeting(String name);
}
class LambdaQues{
    public static void main(String[] args){
        A oA=()->1;
        B oB=(int a)->{System.out.println(a);};
        C oC=(int a,int b)->{return a+b;};
        D oD=(int a,double b)->{System.out.println(a+b);};
        E oE=(String name)->{return name;};
        System.out.println(oA.returnVal());
        oB.printParam(10);
        System.out.println(oC.sum(10,10));
        oD.printSum(10, 10.0);
        System.out.println(oE.greeting("LAst"));
    }
}