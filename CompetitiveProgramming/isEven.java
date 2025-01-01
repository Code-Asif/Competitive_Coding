public class isEven {
    public static void main(String[] args) {
        // System.out.println("Number is even: "+EvenUsingModulas(12));
        // System.out.println("Number is even: "+EvenUsingBitwise(12));
        System.out.println(~(15&1));
    }
    public static boolean EvenUsingModulas(int n){
        return n%2==0;
    }
    public static boolean EvenUsingBitwise(int n){
        return (n&1)==0;
    }
}
