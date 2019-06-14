class Pattr2{
    public static void main(String[] args) {
        int size=6;
        int a[][]=new int[size][];
        for(int i=0;i<size;i++){
            a[i]=new int[size];
            int j1=0;
            for(int j=a[i].length-1;j>=0;j--){
                if(j>a[i].length-i-2){
                    a[i][j]=i+1;
                }
                else a[i][j]=1;
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