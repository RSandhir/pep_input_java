class SingleEx{
    private static SingleEx ob=null;
    private SingleEx(){}
    public static SingleEx getInstance(){
    if(ob==null)
    ob=new SingleEx();
    return ob;
    }
    }
    class Test{
    public static void main(String[] args){
    SingleEx ob=SingleEx().getInstance();
    }
    }