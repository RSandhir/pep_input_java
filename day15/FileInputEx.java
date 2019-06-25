import java.io.*;
class FileInputEx{
    public static void main(String[] args){
        try{
            FileInputStream fileInputStream=new FileInputStream("H:\\file.txt");
            int i=0;
            while((i=fileInputStream.read())!=-1){
                System.out.print((char)i);
            }
            byte b[]=new byte[10];
            fileInputStream.read(b);
            for(byte d:b)
            System.out.println((char)i);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}