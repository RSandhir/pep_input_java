import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ExecEx{
    public static void main(String[] args) {
        Runnable r=()->System.out.println("Hello Thread!");
        ExecutorService eService=Executors.newSingleThreadExecutor();
        eService.submit(r);
        eService.shutdown();
        System.out.print("TaskCompleted");
    }
}