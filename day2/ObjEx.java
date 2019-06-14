class ObjEx{
    int a;
    double d;
    public static void main(String[] args) {
        ObjEx objEx=new ObjEx();
        System.out.println(objEx.a+" "+objEx.d);
        objEx.a=10;
        System.out.println(objEx.a+" "+objEx.d);

        ObjEx objEx2=new ObjEx();
        System.out.println(objEx2.a+" "+objEx2.d);

        objEx2=objEx;

        System.out.println(objEx.a+" "+objEx.d);
        System.out.println(objEx2.a+" "+objEx2.d);
    }
}