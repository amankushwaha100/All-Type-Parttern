public class important1 {
    public static void main(String[] args) {
        int a, b=0;
        for(int i=1;i<=7;i++){
            for(int j=1;j<=b;j++){
                System.out.print(" ");
            }
            if(i<=3){
                a=3;
                b=3*i;
            }else if(i<=6){
                a=2;
                b=9+2*(i-3);
            }else{
                a=1;
                b=17;
            }
            for(int k=1;k<=a;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
