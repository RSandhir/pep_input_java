import java.util.*;
class ScanEx{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        String next=scanner.next();
        String s=scanner.nextLine();
        scanner.close();
        
        for(int i=0;i<a;i++){
            System.out.println(i);
        }
        System.out.println(next);
        System.out.println(s);
    }
}