class Ques3{
    public static void main(String[] args){
        String s="this is an iss22e that is to be resolved";
        char ch[]=new char[s.length()];
        ch=s.toCharArray();
        int i=0;
        int c1=0,c2=0;
        while(i<ch.length-1){
            if(Character.isWhitespace(ch[i]))
            c1++;
            else if(Character.isDigit(ch[i]))
            c2++;
            i++;
        }
        System.out.println(c1+" "+c2);
    }
}