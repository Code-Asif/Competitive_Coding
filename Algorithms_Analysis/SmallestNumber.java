class SmallestNumber {
    public static int Sum(int num){
        int sum=0;
        while(num>0){
            int rem = num%10;
            sum += rem;
            num/=10;
        }
        return sum;
    }
    public static String smallestNumber(int s, int d) {
        // code here
        String res = "";
        int start = (int)Math.pow(10, d-1);
        int end = (int)Math.pow(10, d);
        for(int i=start; i<end; i++){
            int ans = Sum(i);
            if(ans == s){
                res += i;
                return res;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(smallestNumber(9, 2));
    }
}