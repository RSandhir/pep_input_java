import java.util.*;
class JackArr{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[2][];
        a[0]=new int[3];
        a[1]=new int[5];
        for(int j=0;j<a.length;j++){
        for(int i=0;i<a[j].length;i++){
            a[j][i]=sc.nextInt();
        }
    }
    for(int j=0;j<a.length;j++){
        for(int i=0;i<a[j].length;i++){
            System.out.print(a[j][i]+" ");
        }
        System.out.println();
    }
}
}