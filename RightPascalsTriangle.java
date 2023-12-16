public class RightPascalsTriangle {
    public static void main(String[] args) {
        int n =4,p;
        for(int i=1;i<=2*n-1;i++){
            p=i>n?2*n-i:i;
            for(int j=1;j<=p;j++){
                if((p+j)%2==0){
                System.out.print("*  ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
