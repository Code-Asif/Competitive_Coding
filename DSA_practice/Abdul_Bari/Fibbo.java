public class Fibbo {
    public static void main(String[] args) {
        System.out.printf("FIbonacci series nth number = %d", Fibonacci(50));
    }
    public static long Fibonacci(long n){
        if(n==0 || n==1) return n;
        else return Fibonacci(n-1)+Fibonacci(n-2);
    }
}
