import java.util.Scanner;
import java.util.Stack;

public class Code{
    public static void main(String[] args) {
        // Problem1();
        // Problem2();
        
        // String str = "<><??>>";     //4
        // String str2 = "<<?";        //2 
        // String str3 = "??????";     //6
        // String str4 = "??<<>>??";   //8

        // Problem3(str);
        // Problem3(str2);
        // Problem3(str3);
        // Problem3(str4);

        // AnotherApproach(str);
        // AnotherApproach(str2);
        LongestCommonSubString("abcde", "ace");
    }

    public static void rotate(int arr[][]){
        int temp[][] = new int[arr.length][arr[0].length];
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                temp[i][j] = arr[arr.length-i-1][j];
            }
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                arr[i][j] = temp[j][i];
            }
        }
    }

    public static void Problem2(){
        int arr[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element in array");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println();

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        for(int i=0; i<3; i++){
            rotate(arr);
        }

        System.out.println();
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static void Problem1(){
        Scanner sc  =new Scanner(System.in);

        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        char ch;
        int k;

        for(int i=0; i<=n; i++){
            ch = 'A';
            k=1;
            for(int j=0; j<i; j++){
                System.out.print(ch++);
            }
            for(int j=0; j<i; j++){
                System.out.print(k++);
            }
            System.out.println();
        }
        sc.close();
    }

    public static void Problem3(String str){
        // Longest valid substring but not able to replace ? to < or >
        Stack<Character> st = new Stack<>();

        System.out.println(str);

        int count=0, max=0;
        int i=0;
        while(str.length()>i){
            if(str.charAt(i) == '<'){
                st.push('<');
                i++;
            }

            else if(str.charAt(i) == '>'){
                count=0;
                while(!st.isEmpty() && st.peek() != '>'){
                    st.pop();
                    count+=2;
                }
                i++;
            }

            else{
                i++;
                count++;
            }
            max = Math.max(count, max);
        }
        System.out.println(max);

    }

    public static void AnotherApproach(String str){
        /*
            Input <><??>>
            Output 4
            hint: <??> to <<>>
         */

        System.out.println(str);
        Stack<Character> st = new Stack<>();

        int dp[] = new int[str.length()];
        int max = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '<'){
                st.push('<');
                dp[i] = 1;
            }
            else if(str.charAt(i) == '>'){
                if(!st.isEmpty()){
                    st.pop();
                    dp[i] = 2;
                }
            }
            else{
                dp[i] = 1;
            }
        }

        for(int i=0; i<str.length(); i++){
            if(dp[i] == 1){
                int j = i+1;
                while(j<str.length() && dp[j] != 2){
                    j++;
                }
                if(j<str.length()){
                    max = Math.max(max, j-i+1);
                }
            }
        }
        System.out.println(max);
    }

    public static void LongestCommonSubString(String str1, String str2){

        int n = str1.length();
        int m = str2.length();

        int dp[][] = new int[n+1][m+1];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if (i == 0 || j == 0){
                    dp[i][j] = 0;
                }
                else if(str1.charAt(i-1) != str2.charAt(j-1)){
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
                else{
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
            }
        }

        System.out.println(dp[n][m]);
    }   
}
