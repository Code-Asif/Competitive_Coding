public class Seperate {
    public static void main(String[] args) {
        int a[] = new int[]{-2, 2, 5, 6, -1, -3};
        System.out.println("Before seperate: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        seperate(a);
        System.out.println("After seperation");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void seperate(int []arr){
        int i=0; 
        int j=arr.length-1;
        while(i<j){
            while(arr[i]<0) i++;
            while(arr[j]>=0) j--;
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}
