public class PalindrometrianglePattern {
    public static void main(String[] args) {
        int n=4, i;
        for(i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
             int p =i;
            for(int k=1;k<=2*i-1;k++){ 
                System.out.print(p+ " ");   
                 p=(k>=i)?p+1:p-1;
            }
            System.out.println();
        }
    }
}
