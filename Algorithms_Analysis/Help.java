// public class Help{
//     public static void main(String[] args) {
        
//     }
// }
// // -----------------------------------------------------
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Help {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String S = scanner.next();
        int N = scanner.nextInt();
        
        Map<String, Integer> ngramFrequency = new HashMap<>();
        
        for (int i = 0; i <= S.length() - N; i++) {
            String ngram = S.substring(i, i + N);
            ngramFrequency.put(ngram, ngramFrequency.getOrDefault(ngram, 0) + 1);
        }
        
        String mostFrequentNgram = "";
        int maxFrequency = 0;
        
        for (int i = 0; i <= S.length() - N; i++) {
            String ngram = S.substring(i, i + N);
            int frequency = ngramFrequency.get(ngram);
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mostFrequentNgram = ngram;
            }
        }
        
        System.out.println(mostFrequentNgram + " " + maxFrequency);
        
        scanner.close();
    }
}

// -----------------------------------------------------------------------------

// public class Help {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         String S = sc.next();
//         int N = sc.nextInt();
        
//         Map<String, Integer> nFreq = new HashMap<>();
        
//         for (int i = 0; i <= S.length() - N; i++) {
//             String ngram = S.substring(i, i + N);
//             nFreq.put(ngram, nFreq.getOrDefault(ngram, 0) + 1);
//         }
        
//         String mostFreq = "";
//         int maxFreq = 0;
        
//         for (int i = 0; i <= S.length() - N; i++) {
//             String ngram = S.substring(i, i + N);
//             int frequency = nFreq.get(ngram);
//             if (frequency > maxFreq) {
//                 maxFreq = frequency;
//                 mostFreq = ngram;
//             }
//         }
        
//         System.out.println(mostFreq + " " + maxFreq);
        
//         sc.close();
//     }
// }

