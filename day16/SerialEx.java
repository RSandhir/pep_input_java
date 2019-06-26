import java.io.*;

class A implements Serializable{
    int x,y;
    //transient are the variables which we don't want to write in a file
    A(int x,int y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return "x= "+x+" y= "+y;
    }
}

class SerialEx{
    public static void main(String[] args) throws Exception {
        A ob1=new A(2,3);
        FileOutputStream fo=new FileOutputStream("File2.txt");
        ObjectOutputStream oo=new ObjectOutputStream(fo);
        oo.writeObject(ob1);
        oo.close(); fo.close();
        FileInputStream fi=new FileInputStream("File2.txt");
        ObjectInputStream oi=new ObjectInputStream(fi);
        A o=(A)oi.readObject();
        System.out.println(o);
    }
    
}