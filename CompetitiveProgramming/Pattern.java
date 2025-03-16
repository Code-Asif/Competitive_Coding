public class Pattern {
    public static void main(String[] args) {

        // Pattern 
        // int n = 5;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n+2-i; j++){
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }
        System.out.println(binaryToDecimal("1000"));
    }

    public static int binaryToDecimal(String num1){
        // 1 0 1 0
        int num = Integer.parseInt(num1);
        int i=0, ans=0;
        while(num>0){
            int rem = num%10;
            ans+=(rem*Math.pow(2, i++));
            num/=10;
        }
        return ans;
    }
}
