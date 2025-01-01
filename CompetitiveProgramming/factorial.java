public class factorial {
    public static void main(String[] args) {
        System.out.println(factorialUsingIterative(5));
        System.out.println(factorialUsingRecursion(5));
    }

    public static int factorialUsingIterative(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact *= i;
        }
        return fact;
    }

    public static int factorialUsingRecursion(int n){
        if(n<=1)return n;
        else return n*factorialUsingRecursion(n-1);
    }
}