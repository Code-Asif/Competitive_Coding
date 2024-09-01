public class Recursion1 {
    public static void main(String[] args) {
        System.out.println("N to 1");
        PrintNto1(5);
        System.out.println("-------------------------------");
        System.out.println("1 to N");
        Print1toN(5);
        System.out.println("Sum of digit: "+ SumOfDigit(1234));
        System.out.println("Product of digit: "+ProductOfDigit(1234));
        System.out.println("Factorial: "+factorial(5));
        System.out.println("Reverse: "+Reverse(1234));
        System.out.println("Number of digit: "+ ((int)Math.log10(1234)+1));
        int arr[] = {4, 5, 6, 11, 21};
        System.out.println(SortedOrNot(arr, 0));
    }
    public static int PrintNto1(int n){
        if(n==0)return 0;
        else{
            System.out.println(n);
            PrintNto1(n-1);
        }
        return 0;
    }
    public static int Print1toN(int n){
        if(n==0)return 0;
        else{
            Print1toN(n-1);
            System.out.println(n);
        }
        return 0;
    }
    public static int SumOfDigit(int n){
        if(n == 0)return 0;
        else {
            return (n%10)+SumOfDigit(n/10);
        }
    }
    public static int ProductOfDigit(int n){
        if(n == n%10) return n;
        else return n%10 * SumOfDigit(n/10);
    }
    public static int factorial(int n){
        return n<=1?1:n*factorial(n-1);
    }
    public static int Reverse(int n){
        if(n%10 == n) return n;
        else return (n%10)*10+Reverse(n/10);
    }
    public static boolean SortedOrNot(int arr[], int i){
        if(i==arr.length-1)return true;
        else return (arr[i]<arr[i+1] && SortedOrNot(arr, i+1));
    }
}
