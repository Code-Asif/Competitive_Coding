public class hcf {
    // Iterative approach
    static int lcm(int a, int b){
        return (a*b)/recursiveGCD(a,b);
    }

    static int recursiveGCD(int a, int b){
        if(a==0) return b;
        return recursiveGCD(b%a, a);
    }
    public static void main(String[] args) {
        System.out.println(lcm(2, 7));
    }
}
