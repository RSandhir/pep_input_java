import java.util.ArrayList;
import java.util.Iterator;

class ArrayListEx{
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        ArrayList<String> list1=new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        String s[]=list1.toArray();
        System.out.println(list1);
        list1.retainAll(list);
        System.out.println(list1);
        
        Iterator i=list.iterator();
        while(i.hasNext())
        System.out.println(i.next());
    }
}