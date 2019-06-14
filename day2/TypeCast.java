class TypeCast{
    public static void main(String args[]) {
        int x=300;
        byte b=(byte)x;
        byte b2=30;
        int y=b2;

        System.out.println(b);

        byte b1=20;
        byte b3=(byte)(b1+b2);
    }
}