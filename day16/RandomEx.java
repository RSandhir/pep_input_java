import java.io.*;
class RandomEx{
    public static void main(String[] args) throws Exception {
        RandomAccessFile file=new RandomAccessFile("text","r");
        //file.seek(file.length()-10);
        while(file.getFilePointer()<){
            System.out.println(file.readInt());
        }
    }
}