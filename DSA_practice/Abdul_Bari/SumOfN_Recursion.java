public class SumOfN_Recursion{
    public static void main(String[] args) {
        System.out.println("Sum of N number: ");
        System.out.printf("Sum of first 5 number is %d\n", SumOfN(5));
        System.out.printf("Sum of first 5 number is %d using recursion\n", Recursion(5));

    }
    public static int SumOfN(int n){
        int sum=0; 
        while(n >=0){
            sum+=n;
            n--;
        }
        return sum;
    }
    public static int Recursion(int n){
        if(n==0) return 0;
        else return Recursion(n-1)+n;
    }
}