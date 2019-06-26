import java.io.*;
class RandomEx{
    public static void main(String[] args) throws Exception {
        RandomAccessFile file=new RandomAccessFile("text","r");
        file.seek(file.length()-10);
        int a;
        while(a=file.read()!=-1){
            System.out.print((char)a);
        }
    }
}