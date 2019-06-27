class CClass{
    int count=0;
    void increase(){
        for(int i=0;i<50;i++){
            count++;
        }
    }
    int getCount(){
        return count;
    }
}
class LambdaThread {
    public static void main(String[] args) throws Exception {
        CClass c=new CClass();
        new Thread(()->c.increase()).start();
        new Thread(()->c.increase()).start();
        Thread.sleep(50);
        System.out.println(c.getCount());
    }
}