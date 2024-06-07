import java.io.*;
import java.util.*;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {

	//Write code here
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   for(int i=0; i<n; i++){
      int P = sc.nextInt();
      int X = sc.nextInt();
      int R1 = sc.nextInt();
      int N = sc.nextInt();
      int Y = sc.nextInt();
      int R2 = sc.nextInt();
      int paul = (P/X) + R1;
      int nona = (N/Y) + R2;
      if(paul < nona){
         System.out.println("PAUL");
         System.out.println(paul);
      } 
      else if(nona < paul){
         System.out.println("NINA");
         System.out.println(nona);
      }
      else{
         System.out.println("BOTH");
         System.out.println(paul);
      }
   }    
}
}
