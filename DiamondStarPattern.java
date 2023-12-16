public class DiamondStarPattern {
    public static void main(String[] args) {
        int n=5, p;
        for(int i=1;i<=2*n-1;i++){
            p=i>n?(2*n)-i:i;
            for(int j=n;j>p;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=p;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
