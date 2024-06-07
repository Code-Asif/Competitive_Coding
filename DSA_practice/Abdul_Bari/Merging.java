public class Merging {
    public static void main(String[] args) {
        int A[] = new int []{1,5,8, 90};
        int B[] = new int []{2,4,7,10};
        int C[] = merge(A, B);
        System.out.println("Element of C array: ");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i]+" ");
        }
    }

    public static int[] merge(int A[], int B[]){
        int i=0; 
        int m=A.length;
        int j=0;
        int n=B.length;
        int k=0;
        int C[] = new int[m+n];

        while(i<m && j<n){
            if(A[i]<B[j]) C[k++] = A[i++];
            else C[k++] = B[j++];
        }
        for(; i<m; i++){
            C[k++] = A[i++];
        }
        for(; j<n; j++){
            C[k++] = B[j++];
        }
        return C;
    }
}
