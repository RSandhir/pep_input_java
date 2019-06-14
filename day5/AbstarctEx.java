abstract class Figure{
    int d1,d2;
    Figure(int d1,int d2){
        this.d1=10;
        this.d2=20;
    }
    abstract void area();
    void display(){
        System.out.println(d1+" "+d2);
    }
}
class Circle extends Figure{
    @Override
    void area() {
        System.out.println("Circle");
    }
}
class Square extends Figure{
    @Override
    void area() {
        System.out.println(d1*d2);
    }
}
class AbstractEx{
    public static void main(Strin[] args) {
        Square s=new Square();
        s.area();s.display();
    }
}