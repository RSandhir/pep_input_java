import java.util.*;
class AssertEx{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();

        assert age>=18:"Not a valid age";

        System.out.println("Check assertion on:"+age);
    }
}