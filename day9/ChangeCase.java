class ChangeCase{
    public static void main(String[] args){
        String s="this is an issue that is to be resolved";
        char ch[]=new char[s.length()];
        ch=s.toCharArray();
        int i=0;
        while(i<ch.length){
            if(Character.isLowerCase(ch[i]))
            ch[i]=Character.toUpperCase(ch[i]);
            else if(Character.isUpperCase(ch[i]))
            ch[i]=Character.toLowerCase(ch[i]);
            i++;
        }
        String s1=new String(ch);
        System.out.println(s1);
    }
}