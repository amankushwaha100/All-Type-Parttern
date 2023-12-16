public class ButterflyStarPattern {
    public static void main(String[] args) {
        int n=4,p;
        for(int i=1;i<=2*n-1;i++){
            // for printing *
            p=i>n?2*n-i:i;
            for(int j=1;j<=p;j++){
                if((j+p)%2==0){
                System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            // for printing space
            for(int k =1; k<=2*(n-p);k++){
                System.out.print("  ");
            }
            for(int l=1;l<=p;l++){
                if(l%2!=0){
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
