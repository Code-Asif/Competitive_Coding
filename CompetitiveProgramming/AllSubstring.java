import java.util.Scanner;

public class AllSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to find all substring...");
        String str = sc.nextLine();
        allSubstringUsingBrute(str);
        sc.close();
    }

    public static void allSubstringUsingBrute(String str){
        for(int i=0; i<str.length(); i++){
            String temp = "";
            for(int j=i; j<str.length(); j++){
                temp += ""+str.charAt(j);
                System.out.println(temp);
            }
        }
    }
}
