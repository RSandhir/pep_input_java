class Test{
    int x;
    int y;
    Test(int a,int b){
        this.x=a;
        this.y=b;
    }
    int getX(){
        return x;
    }
    int getY(){
        return y;
    }
    void setX(int x){
        this.x=x;
    }
    void setY(int y){
        this.y=y;
    }
    static boolean compareTest(Test t1,Test t2){
        if((t1.x==t2.x)&&(t1.y==t2.y)){
            return true;
        }
        else return false;
    }
    static Test compareNewTest(Test t1,Test t2){
        return new Test(t1.x-t2.x,t1.y-t2.y);
    }
    public static void main(String args[]) {
        Test t1=new Test(10,10);
        Test t2=new Test(20,20);
        System.out.println(compareTest(t1,t2));
        System.out.println(compareNewTest(t1, t2).x+" "+compareNewTest(t1, t2).y);
        t2.setY(10);
        t2.setX(10);
        System.out.println(compareTest(t1,t2));
        System.out.println(compareNewTest(t1, t2).x+" "+compareNewTest(t1, t2).y);
    }
}