class ExceptionEx{
    public static void main(String[] args){
        int a[]=new int[5];
        try{
            int x=10;
            int y=10;
            int z=x/y;
            a[7]=90;
            System.out.println("TryBlock");
        }
        catch(ArithmeticException e){
            System.out.println("arith catch");
        }
        catch(Exception e){
            System.out.println("Exception");
        }

        finally{
            System.out.println("Finnaly");
        }
    }
}