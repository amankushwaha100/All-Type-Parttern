public class HollowtrianglePattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                if(i==1||k==1||i==n||k==i){
                System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
