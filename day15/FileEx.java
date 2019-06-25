import java.io.File;

class FileEx{
    public static void main(String[] args){
        File file=new File("H://file.txt");
        if(file.exists()){
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getPath());
        }
        else{
           // file.createNewFile(file2.txt);
        }
    }
}