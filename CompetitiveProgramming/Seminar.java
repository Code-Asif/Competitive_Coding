public class Seminar{
    public static boolean QueenStep(int a, int b, int c, int d){
        if(a == c+1 && b == d+1)return true;
        else if(a == c-1 && b == d-1) return true;
        
        return false;
    }
    public static void main(String[] args) {
        int a=1, b=1;
        int c=1, d=2;
        System.out.println(QueenStep(a, b, c, d));;
    }
}