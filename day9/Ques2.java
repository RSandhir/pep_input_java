class Ques2{
    public static void main(String[] args){
        String s="this is an issue that is to be resolved";
        char ch[]=new char[s.length()];
        ch=s.toCharArray();
        ch[0]=Character.toUpperCase(ch[0]);
        int i=0;
        while(i<ch.length){
            if(ch[i]==' ')
            ch[i+i]=Character.toUpperCase(ch[i+1]);
            i+=1;
        }
        String s1=new String(ch);
        System.out.println(s1);
    }
}