class OverloadEx{
    public static void main(String args[]) {
        OverloadEx obj1=new OverloadEx();
        obj1.meth(1, 2);
        System.out.println(obj1.meth(1.1, 2));
        obj1.meth(1.2, 2.1);
        System.out.println(obj1.meth(2, 2.6));
    }
    /*void meth(int  x,int y){
        System.out.println(x+":"+y);
    }*/
    int meth(int x,double y){
        return(int)(x+y);
    }
    void meth(double  x,double y){
        System.out.println(x+":"+y);
    }
    int meth(double x,int y){
        return(int)(x+y);
    }
}