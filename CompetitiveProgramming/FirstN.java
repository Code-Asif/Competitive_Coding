public class FirstN {
    public static void main(String[] args) {
        printFirstN(10);
        System.out.println();
        FirstNto1(10);
        // FirstNOdd(10);
        // FirstNEven(10);
        // System.out.println(FirstNOddSum(5));
        // FirstNOddSum(5);
    }
    
    static int sum=0;
    public static void FirstNOddSum(int n){
        if(n == 1){
            sum += 1;
            System.out.println(sum);
            return;
        }
        if(n%2!=0){
            sum+=n;
            FirstNOddSum(n-2);
        }
        else{
            FirstNOddSum(n-1);
        }
        // return n==1 ? 1 : (n + FirstNOddSum(n-2));
    }


    public static void printFirstN(int n){
        if(n>1){
            printFirstN(n-1);
            System.out.print(n+" ");
        }else{
            System.out.print(n+" ");
        }
    }

    static int i=1;
    public static void FirstNto1(int n){
        if(i == n){
            System.out.print(n+" ");
        }else{
            System.out.print(n+" ");
            FirstNto1(n-1);
        }
    }


    public static void FirstNOdd(int n){
        if(n>1){
            // FirstN(n-1);
            System.out.println(n);
        }else{
            System.out.println(n);
        }
    }
    
    public static void FirstNEven(int n){
        if(n>1){
            // FirstN(n-1);
            System.out.println(n);
        }else{
            System.out.println(n);
        }
    }
}
