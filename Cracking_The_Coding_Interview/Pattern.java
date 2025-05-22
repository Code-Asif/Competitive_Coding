public class Pattern {
    public static void main(String[] args) {
        Pattern1(5);
    }

    public static void Pattern1(int n){
        for(int i=0; i<=n; i++){
            for(int j=0; j<=n-i-1; j++){
                System.out.print(" ");
            }
            for(int k=0; k<i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
