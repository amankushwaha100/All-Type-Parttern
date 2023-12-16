public class MirrorImagetrianglePattern {
    public static void main(String[] args) {
        int n=4, p, q;
        for(int i=1;i<=2*n-1;i++){
            p=i>n?2*n-i:i;
        for(int j=1;j<p;j++){
            System.out.print(" ");
        }
        q=p;
        for(int k=n;k>=p;k--){
            System.out.print(q++ +" ");
        }
        System.out.println();
        }
    }
}
