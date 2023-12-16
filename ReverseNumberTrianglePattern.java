public class ReverseNumberTrianglePattern {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
             int p=i;
            for(int k=n;k>=i;k--){ 
                System.out.print(p + " ");
                p++;
            }
            System.out.println();
        }
    }
}
