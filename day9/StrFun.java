class StrFun{
    public static void main(String[] args){
        String s1="hello";
        String s2="HEllo";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println(s1.equals(s2));
        System.out.println(s1.concat(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}