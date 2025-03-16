import java.util.Scanner;

public class TSS_Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr1[] = new int[n];
        int arr2[] = new int[n];

        System.out.println("Enter the elements for Array 1: ");
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the elements for Array 2: ");
        for(int i=0; i<n; i++){
            arr2[i] = sc.nextInt();
        }
        sc.close();

        int ans[] = new int[2*n];
        int i=0, j=0, k=0;
        while(i<n && j<n){
            if(arr1[i]<arr2[j]){
                ans[k++] = arr1[i++];
            }
            else {
                ans[k++] = arr2[j++];
            }
        }
        while(i<n){
            ans[k++] = arr1[i++];
        }
        while(j<n){
            ans[k++] = arr2[j++];
        }
        System.out.println("Merged Array: ");
        for(i=0; i<2*n; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
