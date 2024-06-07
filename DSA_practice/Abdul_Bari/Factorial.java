public class Factorial {
    public static void main(String[] args) {
        int x = 12;
        System.out.printf("Factorial of %d is %d", x, Facto(x));
    }
    public static int Facto(int n){
        if(n == 1 || n == 0) return 1;
        else return n*Facto(n-1);
    }
}
