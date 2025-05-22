import java.util.Arrays;

public class Arrays_StringQuestions{
    public static void main(String[] args) {
        // System.out.println(isUnique("Asif"));
        // System.out.println(URLify("asif alam .com"));
        // System.out.println(oneAway("pale", "bake"));
        // System.out.println(compress("aaabaabbbccc"));
        // int arr[][] = {{1, 2, 3}, {4, 0, 6}, {7, 8, 9}};
        // printArray(arr);
        // System.out.println();
        // // rotate(arr);
        // setZeroMatrix(arr);
        // printArray(arr);
        // ASIF -> FASI -> IFAS -> SIFA -> ASIF
        System.out.println(checkStringRotation("ASIF", "IFAS"));
        
    }

    public static boolean isUnique(String str){
        int arr[] = new int[255];
        for(int i=0; i<arr.length; i++){
            arr[i] = 0;
        }
        for(int i=0; i<str.length(); i++){
            arr[str.charAt(i)]++;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] > 1)return false;
        }
        return true;
    }

    public static char[] URLify(String str){
        String ans = "";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ' ')ans+="30%";
            else ans += str.charAt(i);
        }
        return ans.toCharArray();
    }

    public static boolean oneAway(String str1, String str2){
        if(Math.abs(str1.length()-str2.length()) > 1)return false;

        int arr[] = new int[255];
        Arrays.fill(arr, 0);
        for(int i=0; i<str1.length(); i++){
            arr[str1.charAt(i)]++;
        }
        int count=0;
        for(int i=0; i<str2.length(); i++){
            if(arr[str2.charAt(i)] > 0)arr[str2.charAt(i)]--;
            else count++;
        }
        for(int i=0; i<arr.length; i++){
            count+=arr[i];
        }
        return count==1 || count==2;
    }

    public static String compress(String str){
        String ans = "";
        int count=1;
        int i;
        for(i=1; i<str.length(); i++){
            if(str.charAt(i) == str.charAt(i-1))count++;
            else {
                ans += str.charAt(i-1)+""+count;
                count=1;
            }
        }
        ans += str.charAt(i-1)+""+count;

        return ans;
    }

    public static void printArray(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void rotate(int arr[][]){
        /*
        input
         {1, 2, 3}
         {4, 5, 6}
         {7, 8, 9}

        output
         {7, 4, 1}
         {8, 5, 2}
         {9, 6, 3}
         */
        int n = arr.length;
        int ans[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                ans[i][j] = arr[n-j-1][i];
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = ans[i][j];
            }
        }
    }

    public static void setZeroMatrix(int arr[][]){
        int n = arr.length, m = arr[0].length;
        int rows[] = new int[n];
        int cols[] = new int[m];

        Arrays.fill(rows, -1);
        Arrays.fill(cols, -1);

        // mark rows zero
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j] == 0){
                    rows[i] = 0;
                    break;
                }
            }
        }

        // mark cols zero
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[j][i] == 0){
                    cols[j] = 0;
                    break;
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(rows[i] == 0 || cols[j] == 0){
                    arr[i][j] = 0;
                }
            }
        }

    }

    public static String stringRotate(String str){
        // ASIF -> FASI
        String ans = "";
        // char [] ans = str.toCharArray();
        char ch = str.charAt(str.length()-1);
        ans+= ch;
        for(int i=0; i<str.length()-1; i++){
            ans+= str.charAt(i);
        }
        return ans;
    }

    public static boolean checkStringRotation(String str1, String str2){
        if(str1.length() != str2.length()) return false;

        for(int i=0; i<str1.length()+1; i++){
            if(str1.equals(str2))return true;
            else str2 = stringRotate(str2);
        }
        return false;
    }


}