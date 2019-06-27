import java.util.concurrent.Exchanger;

class ThreadExchange{
    public static void main(String[] args) {
        
    }
}
class MakeString implements Runnable{
    Exchanger<String> ex;
    String str;
    MakeString(Exchange<String> ex){
        this.ex=ex;
        str=new String();
        new Thread(this).start();
    }
    public void run(){
        char ch='A';
        for(int i=0;i<3;i++)
        for(int j=0;j<5;j++)
        str+=ch++;
        try{
            str=ex.exchange(str);
        }
        catch(Exceptiion e){}
    }
}