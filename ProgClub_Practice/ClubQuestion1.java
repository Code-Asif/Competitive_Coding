import java.util.Scanner;

public class ClubQuestion1 {
        public static void main(String[] args) {
                int t, sum1, sum2, ans = 0;
                int Arr[][] = new int[10][2];
                Scanner sc = new Scanner(System.in);
                t = sc.nextInt();
                int AnsArr[] = new int[t];
                for (int i = 0; i < t; i++) {
                        sum1 = 0;
                        sum2 = 0;
                        int g = sc.nextInt();
                        int p = sc.nextInt();
                        int n = sc.nextInt();
                        for (int j = 0; j < n; j++) {
                                for (int k = 0; k < 2; k++)
                                        Arr[j][k] = sc.nextInt();
                        }
                        for (int j = 0; j < n; j++) {
                                if (Arr[j][0] == 1)
                                        sum1 = sum1 + g;
                                if (Arr[j][1] == 1)
                                        sum1 = sum1 + p;
                        }
                        for (int j = 0; j < n; j++) {
                                if (Arr[j][0] == 1)
                                        sum2 = sum2 + p;
                                if (Arr[j][1] == 1)
                                        sum2 = sum2 + g;
                        }

                        ans = sum1 > sum2 ? sum2 : sum1;
                        AnsArr[i] = ans;
                }
                for (int d = 0; d < t; d++) {
                        System.out.println(AnsArr[d]);
                }
                sc.close();
        }
}