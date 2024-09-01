public class StarPattern {

    public static void Pattern1(int n){
        // *
        // * *
        // * * * 
        // * * * * 
        // * * * * *
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void Pattern2(int n){
        //     *
        //    * *
        //   * * * 
        //  * * * * 
        // * * * * *
        for(int i=0; i<n; i++){
            for(int k=n-i; k>=0; k--){
                System.out.print(" ");
            }
            for(int j=0; j<i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern1(5);
        System.out.println();
        Pattern2(5);
    }
}
