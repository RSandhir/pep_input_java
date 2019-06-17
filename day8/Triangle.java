import java.util.*;
class IllegalTriangleException extends Exception{
    IllegalTriangleException(String s){
        super(s);
    }
}
class Triangle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        try{
        if (a<0||b<0||c<0)
        throw new IllegalTriangleException("Negative side not allowed");
        }
        catch(IllegalTriangleException e){
            System.out.println("Exception:"+e.getMessage());
        }
    }
}