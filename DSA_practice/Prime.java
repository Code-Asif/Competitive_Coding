import java.util.Scanner;
public class Prime{
    public static void main(String[] args) {
        int n=10; 
        int i=2;
        while(i<n){
            if(n%i==0) {
                System.out.println("Not a prime number");
                break;
            }
            i++;
        }
        System.out.println("Prime number");
    }
}