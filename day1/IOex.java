import java.io.*;
class IOex{
    public static void main(String args[]) throws IOException{
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader reader=new BufferedReader(read);
        System.out.print("Enter:");
        int i=Integer.parseInt(reader.readLine());
        System.out.println("Val:"+i);
    }
}