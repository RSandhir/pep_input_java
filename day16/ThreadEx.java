class MyThread implements Runnable{
    Thread t;
    MyThread(String s){
        t=new Thread(this,s);
        t.start();
    }
    public void run(){
        System.out.println(t.getName()+" Start");
        for(int i=0;i<10;i++){
            System.out.println(t.getName());
            try{t.sleep(600);} catch(Exception e){}
        }
        System.out.println(t.getName()+" Ended");
    }
}
class ThreadEx{
    public static void main(String[] args) throws Exception {
        Thread thread=Thread.currentThread();
        System.out.println(thread);
        thread.setName("ReMain");
        System.out.println(thread);

        MyThread t1=new MyThread("One");
        MyThread t2=new MyThread("Two");
        MyThread t3=new MyThread("THree");
        t1.run();
        t2.run();
        t3.run();
    }
}