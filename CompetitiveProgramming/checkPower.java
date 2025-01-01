public class checkPower {
    public static boolean power2(double num){
        // for(int i=0; i<=Math.sqrt(num); i+=k){
        //     if(num == Math.pow(k, i))return true;
        // }
        // return false;
        while(num>1){
            num = num/2;
        }
        return num==1;
    }

    public static boolean power2UsingBitwise(int num){
        return (num&(num-1))==0;
    }

    public static boolean power4(double num){
        while(num>4){
            num = num/4;
        }
        return num==1;
    }

    public static boolean power4UsingBitwise(int num){
        return false;
    }

    public static void main(String[] args) {
        int n = 44;
        System.out.println("Number is power of 2 or not: "+power2(n));
        System.out.println("Number is power of 2 or not: "+power2UsingBitwise(n));
        System.out.println("Number is power of 4 or not: "+power4(n));
        System.out.println("Number is power of 4 or not: "+power4UsingBitwise(n));
        System.out.println(n&11);
    }
}
