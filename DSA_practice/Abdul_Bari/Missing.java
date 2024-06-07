import java.util.ArrayList;

public class Missing {
    public static void main(String[] args) {
        int a[] = new int[] { 1, 2, 3, 4, 6, 7 };
        int a2[] = new int[] { 1, 2, 10 };
        System.out.println("Missing element : \n" + MissingElement(a));
        System.out.println("All Missing element :");
        AllMissingElement2(a2);
    }

    public static int MissingElement(int arr[]) {
        int key = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != key)
                return key;
            else
                key++;
        }
        return -1;
    }

    public static void AllMissingElement2(int arr[]) {
        int diff = arr[0];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - i != diff) {
                while (diff < arr[i] - i) {
                    list.add(diff + i);
                    diff++;
                }
            }
        }
        System.out.print(list);
    }
}
