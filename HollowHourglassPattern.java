public class HollowHourglassPattern {
    public static void main(String[] args) {
        int n=4,p;
        for(int i=1;i<=2*n-1;i++){
            p=i>n?2*n-i:i;
            for(int j=1;j<=p;j++){
                System.out.print(" ");
            }
            for(int k=2*n-p;k>=p;k--){
                if(k==p||p==1||k==2*n-p){
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
