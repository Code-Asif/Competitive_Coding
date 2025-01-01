public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(FibUsingFormula(30));
        System.out.println(FibUsingIteration(30));
        System.out.println(Fib(30));
    }

    public static int Fib(int n){
        if(n<2){
            return n;
        }
        return Fib(n-1)+Fib(n-2);
    }

    public static int FibUsingIteration(int n){
        if(n<2)return n;
        int a = 0;
        int b = 1;
        for(int i=2; i<=n; i++){
            int temp = b;
            b = a+b;
            a = temp;
        }
        return b;
    }

    public static int FibUsingFormula(int n){
        return (int)((Math.pow(((1+Math.sqrt(5))/2), n)-Math.pow(((1+Math.sqrt(5))/2), n))/((Math.sqrt(5))));
    }
}
