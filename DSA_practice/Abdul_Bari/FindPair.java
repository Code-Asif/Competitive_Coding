public class FindPair {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 9};
        System.out.println("Using 1: ");
        FindPairSum(arr, 10);
        // System.out.println("Using 2: ");
        // FindPairSumUsingHashtable(arr, 10);
        System.out.println("Third 3: ");
        AnotherMethod(arr, 10);
    }

    public static void FindPairSum(int arr[], int sum) {
        int a[] = new int[arr.length];
        a = arr.clone();
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == sum) {
                    System.out.println(a[i] + " + " + a[j] + " = " + (a[i] + a[j]));
                    count++;
                }
            }
        }
        if (count == 0)
            System.out.println("There is no such element...");
    }

    public static void FindPairSumUsingHashtable(int arr[], int sum) {
        int hash[] = new int[arr.length];
        for (int i = 0; i < hash.length; i++) {
            hash[i] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            if (hash[sum - arr[i]] != 0)
                System.out.println(sum - arr[i] + " + " + arr[i] + " = " + hash[sum - arr[i]]);
        }
    }
    public static void AnotherMethod(int arr[], int sum){
        int i=0; 
        int j=arr.length-1;
        while(!(i==j)){
            if(arr[i]+arr[j]==sum) {
                System.out.println(arr[i]+" + "+arr[j]+" = "+sum);
                i++;
                j--;
            }
            else if(arr[i]+arr[j]>sum) j--;
            else i++;
        }
    }
}
