public class Combination {
    public static void main(String[] args) {
        int n = 5;
        int r = 3;
        System.out.printf("Combination using Iterative of %d and %d = %d\n", n, r, C(n, r));
        System.out.printf("Combination using Recursive of %d and %d = %d\n", n, r, RC(n, r));
    }
    // Iterative
    public static int C(int n, int r){
        return facto(n)/(facto(r)*facto(n-r));
    }
    public static int facto(int n){
        if(n==1 || n==1) return 1;
        else return n*facto(n-1);
    }
    // Recursive
    public static int RC(int n, int r){
        if(r==0 || n==r) return 1;
        else return RC(n-1, r-1)+RC(n-1, r);
    }
}
