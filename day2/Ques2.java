class Ques2{
    public static void main(String args[]) {
        System.out.println(args[0]+" "+args[1]);
        if(args[0].equals("1")){
            switch(args[1]){
                case "a":
                System.out.println("1st case");
                break;
                case "b":
                int j=0;
                for(int i=0;i<5;i++){
                    while(j<5){
                        System.out.println("*");
                        j++;
                    }
                }
                break;
                default:
                System.out.println("Default");
            }
        }
    }
}