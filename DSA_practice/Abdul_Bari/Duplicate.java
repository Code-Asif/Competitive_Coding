public class Duplicate{
    public static void main(String[] args) {
        int a[] = new int[]{2,3,1,5,2,4,3,1,3,4,4};
        PrintDuplicate(a);
        PrintDuplicateUsingHashTable(a);
    }
    public static void PrintDuplicate(int []a){
        int arr[] = new int[]{};
        arr = a.clone();

        System.out.println("Dublicate simple");
        for(int i=0; i<arr.length-1; i++){
            int count = 1;
            if(arr[i] != -1){
                for(int j=i+1; j<arr.length; j++){
                    if(arr[i] == arr[j]){
                        count++;
                        arr[j] = -1;
                    }
                }
            }
            if(count>1) System.out.println(arr[i]+" "+count+" Times");
        }
    }
    public static void PrintDuplicateUsingHashTable(int []arr){
        System.out.println("Dublicate using hashtable");
        int hash[] = new int[arr.length];
        for (int i = 0; i < hash.length; i++) {
            hash[i] = 0;
        }
        for(int i=0; i<arr.length; i++){
            hash[arr[i]]++;
        }
        for(int i=0; i<hash.length; i++){
            if(hash[i] >0) System.out.println(i+" "+hash[i]+"Times");
        }
    }
}