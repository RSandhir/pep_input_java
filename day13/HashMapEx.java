import java.util.*;
class HashMapEx{
    public static void main(String[] args){
        HashMap<String,Integer> hm=new HashMap<>();

        hm.put("1st",1);
        hm.put("2nd",2);
        hm.put("3rd",3);
        hm.put("4th",4);
        hm.put("5th",5);


        for(Map.Entry<String,Integer> i:hm.entrySet()){
            System.out.println("Key:"+i.getKey()+" Value:"+i.getValue()+" Hash:"+i.hashCode());
        }
    }
}