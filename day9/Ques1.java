class Ques1{
    public static void main(String[] args){
        String s1="is";
        String s2="this is an issue that is to be resolved";
        int i=-1;
        int count=0;
        while(s2.indexOf(s1,i+1)>0){
                count+=1;
            }
        System.out.println(count);
    }
}