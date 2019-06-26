class CallMe{
    synchronized void call(String msg){
        System.out.println("["+msg);
        try{
            Thread.sleep(600);
        }
        catch(Exception e){System.out.println("interupted");}
        System.out.println("]");
    }
}
class Caller implements Runnable{
    String msg;
    CallMe target;
    Thread t;
    public Caller(CallMe target,String s){
        this.target=target;
        msg=s;
        t=new Thread(this);
        t.start();
    }
    public void run(){
        target.call(msg);
        /*or
        synchronized(target){
            target.call(msg);
        }
        */
    }
}
class SyncEx{
    public static void main(String[] args) {
        CallMe target=new CallMe();
        Caller ob1=new Caller(target, "Hello");
        Caller ob2=new Caller(target, "Synced");
        Caller ob3=new Caller(target, "World");

        //try{
          //  ob1.t.
        //}
    }
}