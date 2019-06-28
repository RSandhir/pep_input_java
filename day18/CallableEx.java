import java.util.concurrent.*;

class CallableEx{
    public static void main(String[] args) throws Exception{
        ExecutorService eService=Executors.newFixedThreadPool(3);
        Future<Integer> f1;
        Future<Double> f2;
        
        System.out.println("Starting");

        f1=eService.submit(new Sum(5));
        f2=eService.submit(new Prod(3.4,5.1));

        System.out.println(f1.get());
        System.out.println(f2.get());
        eService.shutdown();
    }
}

class Sum implements Callable<Integer>{
    int n;
    Sum(int n){
        this.n=n;
    }
    public Integer call(){
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=i;
        return sum;
    }
}
class Prod implements Callable<Double>{
    double d1,d2;
    Prod(double d1,double d2){
        this.d1=d1;
        this.d2=d2;
    }
    public Double call(){
        return d1*d2;
    }
}