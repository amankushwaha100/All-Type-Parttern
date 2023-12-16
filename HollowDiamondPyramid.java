public class HollowDiamondPyramid {
    public static void main(String[] args) {
        int n=4, p;
        for(int i=1;i<=2*n-1;i++){
            p=i>n?2*n-i:i;
            for(int j=1;j<=n-p;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*p-1;k++){
                if(k==1||k==2*p-1){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
