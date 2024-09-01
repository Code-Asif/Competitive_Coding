public class gcd {
    // Iterative approach
    static int iterativeGCD(int a, int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    // Recursive approach
    static int recursiveGCD(int a, int b){
        if(a==0) return b;
        return recursiveGCD(b%a, a);
    }
    public static void main(String[] args) {
        System.out.println(iterativeGCD(18, 6));
        System.out.println(recursiveGCD(18, 6));
    }
}
