public class TowerOfHanoi {
    public static void main(String[] args) {
        TOH(3, 'A', 'B', 'C');
    }
    public static void TOH(int n, char A, char B, char C){
        if(n>0){
            TOH(n-1, A, C, B);
            System.out.printf("Move disk from %c to %c\n", A, C);
            TOH(n-1, B, A, C);
        }
    }
}
