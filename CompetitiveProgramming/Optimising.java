import java.io.*;
import java.util.*;
public class Optimising {
   public static void main(String args[] ) throws Exception {

	//Write code here
      Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] weights = new int[N];
        for (int i = 0; i < N; i++) {
            weights[i] = scanner.nextInt();
        }
        
        Arrays.sort(weights);
        
        int maxTeams = 0;
        
        for (int s = 2; s <= 2 * N; s++) {
            int teams = countTeams(weights, s);
            maxTeams = Math.max(maxTeams, teams);
        }
        
        System.out.println(maxTeams);
   }     
   public static int countTeams(int[] weights, int s) {
        int count = 0;
        int left = 0, right = weights.length - 1;
        
        while (left < right) {
            if (weights[left] + weights[right] == s) {
                count++;
                left++;
                right--;
            } else if (weights[left] + weights[right] < s) {
                left++;
            } else {
                right--;
            }
        }
        
        return count;
    }
}
 {
    
}
