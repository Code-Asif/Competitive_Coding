public class Print1ToN{
    public static void main(String[] args) {
        P1toN(5);
        System.out.println("----------------------------");
        PNto1(5);
    }
    public static void P1toN(int num){
        if(num>0) {
            System.out.println(num);
            P1toN(num-1);
        }
        else{
            return;
        }
    }
    public static void PNto1(int num){
        if(num>0){
            PNto1(num-1);
            System.out.println(num);
        }
        else{
            return;
        }
    }
}