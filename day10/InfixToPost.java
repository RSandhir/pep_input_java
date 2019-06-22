import java.util.Stack;
class InfixToPost{
    public static void main(String[] args){
        String exp="a+b-c*(d/e^f)*g*h-i";
        System.out.println(convertExp(exp));
    }
    static String convertExp(String exp){
        Stack<Character> stack=new Stack<>();
        String result="";
        for(int i=0;i<exp.length();i++){
            char c=exp.charAt(i);
            if(Character.isLetter(c))
            stack.push(Integer.parseInt(""+c));
            else{
                int v1=stack.pop();
                int v2=stack.pop();
                switch(c){
                    case '+': stack.push(v1+v2); break;
                    case '-': stack.push(v1-v2); break;
                    case '*': stack.push(v1*v2); break;
                    case '/': stack.push(v1/v2); break;
                    case '^': stack.push((int)Math.pow(v1,v2)); break;
                    default: System.out.println("Wrong operator"); break;
                }
            }
        }
        while(!stack.isEmpty()){
            result+=String.valueOf(stack.pop());
        }
        return result;
    }
}