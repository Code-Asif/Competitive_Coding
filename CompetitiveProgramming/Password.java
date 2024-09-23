import java.util.*;

public class Password{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your password: ");
        String password = sc.next();

        String ans="";
        for(int i=0; i<password.length(); i++){
            for(char c = 'a'; c<='z'; c++){
                if(password.charAt(i) == c){
                    ans+=""+c;
                    break;
                }
                System.out.println(ans+c);
            }
        }
        System.out.println(ans);

        sc.close();
    }
}