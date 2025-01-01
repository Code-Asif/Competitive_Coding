import java.util.Arrays;

public class makingChange {
    public static void main(String[] args) {
        int coins[] = {40,1,3,4, 2, 5, 9,10, 20};
        change(82, coins);
    }
    public static void change(int num, int arr[]){
        int ans[] = new int[arr.length];
        int temp = num;
        int i = arr.length-1;
        
        Arrays.sort(arr);

        while(num>0){
            while(num>=arr[i]){
                num-=arr[i];
                ans[i] = ans[i]+1;
            }
            i--;
        }
        System.out.println("For "+temp+" following are change: ");

        for(int j=arr.length-1; j>=0; j--){
            System.out.println("For "+arr[j]+" : "+ans[j]);
        }
    }
    
}
