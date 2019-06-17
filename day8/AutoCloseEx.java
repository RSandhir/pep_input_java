class X implements AutoCloseable{
    public void close(){
        System.out.println("Closing x class instance");
    }
}
class AutoCloseEx{
    public static void main(String[] args){
        try(X o=new X()){
            System.out.println("try exec");
        }
        catch(Exception e){
        }
    }
}