class Base{
    public Base(){
        System.out.println("BAse");
    }
}
public class Derived extends Base{
    public Derived(){
        this("Exam");
        System.out.println("Derived");
    }
    public Derived(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
        new Derived();
    }
}