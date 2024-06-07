public class TaylorSeries {
    public static void main(String[] args) {
        int x = 4;
        int n = 15;
        System.out.printf("Taylor Series of %d is %d", x, taylor(x));
        System.out.printf("Taylor Series of %ld is %ld", x, Newtaylor(x, n));
    }

    public static double Newtaylor(int n, int x){
        double p=1, f=1;
        double ans;
        if(n==0) return 1;
        ans = Newtaylor(x, n-1);
        p*=x;
        f*=n;
        return ans+p/f;
    }

    public static int taylor(int n) {
        int e = 1;
        for (int i = 1; i <= n; i++) {
            e += pow(n, i) / facto(i);
        }
        return e;
    }

    public static int facto(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * facto(n - 1);
        }
    }

    public static int pow(int m, int n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            return pow(m * m, n / 2);
        } else {
            return pow(m * m, (n - 1) / 2);
        }
    }
    public static int NTayler(int x, int n){
        int s = 1;
        for(; n>0; n--){
            s= 1+ x/n*s;
        }
        return s;
        
    }
}
