import java.util.*;
interface Figure<T extends Number>{
    double area(T dimX,T dimY);
    //double perimeter(T dimX,T dimY);
}
class Rectangle<T extends Number> implements Figure<T>{
    public double area(T dimX,T dimY){
        return dimX.doubleValue()*dimY.doubleValue();
    }

}
/*class Triangle implements Figure{

}
class Square implements Figure{

}*/
class GenQ{
    public static void main(String[] args){
        Rectangle<Integer> r=new Rectangle<>();
        System.out.println(r.area(23,12));
    }
}