public class Exponent {
    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        System.out.printf("Power of %d rest to %d= %d\n", a, b, pow(a,b));
        System.out.printf("Power of %d rest to %d= %d\n", a, b, Newpow(a,b));

    }

    public static int pow(int m, int n){
        if(n==0) return 1;
        else return pow(m , n-1)*m;
    }

    public static int Newpow(int m, int n){
        if(n==0) return 1;
        if(n%2==0) return pow(m*m, n/2);
        else return pow(m*m, (n-1)/2);
    }
}
