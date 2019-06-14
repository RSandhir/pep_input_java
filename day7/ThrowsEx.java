import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ThrowsEx{
    public static void main(String[] args) throws IOException{
        BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
        String s=read.readLine();
        int x=10;
        while(x>0){
            System.out.println(x);
            try{
            Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println("x");
            }
        }
    }
}