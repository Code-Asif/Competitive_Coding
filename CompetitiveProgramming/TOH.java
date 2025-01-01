public class TOH {
    public static void main(String[] args) {
        TowerOfHanoi(10, 'A', 'B', 'C');
        System.out.println(TowerOfHanoiUsingIteration(10));;
    }

    static int count = 1;
    public static void TowerOfHanoi(int n, char A, char B, char C){
        if(n>0){
            TowerOfHanoi(n-1, A, C, B);
            System.out.printf("%d. Move %c to %c\n",count++, A, C);
            TowerOfHanoi(n-1, B, A, C);
        }
    }
    public static int TowerOfHanoiUsingIteration(int n){
        int steps = 0;
        for(int i=1; i<=n; i++){
            steps = (steps*2)+1;
        }
        return steps;
    }
}