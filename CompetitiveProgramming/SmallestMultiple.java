import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;

public class SmallestMultiple {
    public static String findSmallestMultiple(int n) {
        if (n == 1) {
            return "1";
        }

        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        
        while (!queue.isEmpty()) {
            String current = queue.poll();

            BigInteger num = new BigInteger(current);
            if (num.mod(BigInteger.valueOf(n)).equals(BigInteger.ZERO)) {
                return current;
            }
            queue.add(current + "0");
            queue.add(current + "1");
        }
        
        return null; 
    }

    // public static int findSmallestMultiple(int n){
    //     int num = 1;
    //     if(n == 1) return 1;
    //     else{
    //         while((num%n)!=0){
    //             num *= 10;
    //             if(num%n==0)return num;
    //             System.out.println(num);
    //             num++;
    //             if(num%n==0)return num;
    //             System.out.println(num);
    //         }
    //         return num;
    //     }
    // }

    public static int multipleOfNum(int num){
        int temp = num;
        while(true){
            if(temp%num == 0 && check1(temp)) return temp;
            temp+=num;
        }
    }

    public static boolean check1(int num){
        while(num>0){
            int rem = num % 10;
            if(rem != 1 && rem != 0) return false;
            num /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 3; // Example input
        // System.out.println("Smallest multiple of " + n + " with only digits 0 and 1: " + findSmallestMultiple(n));
        // System.out.println(multipleOfNum(n));
        System.out.println(~(10));
    }
}
