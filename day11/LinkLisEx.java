import java.util.*;
class LinkLisEx{
    public static void main(String[] args){
        LinkedList<String> list=new LinkedList<>();
        list.add("1st");
        list.add("2nd");
        list.add("3rd");
        if(list.contains("3rd")){
            list.add(list.indexOf("3rd")+1,"4th");
        }
       /* System.out.println(list);
        System.out.println(list.peek());
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());
        System.out.println(list.size());
        Object[] s=list.toArray();*/
        System.out.println(list.poll());
        System.out.println(list.pollFirst());
        System.out.println(list.pollLast());
        list.add("aa");
        System.out.println(list);
        //System.out.println(s[0]);
    }
}