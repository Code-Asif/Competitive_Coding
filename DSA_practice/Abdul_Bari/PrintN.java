public class PrintN{
    public static void main(String[] args) {
        P(5);
    }
    public static void P(int n){
        if(n <= 1){
            System.out.println(1);
            return;
        }
        else{
            P(n-1);
            System.out.println(n);
        }
    }
}