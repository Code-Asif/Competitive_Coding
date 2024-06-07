class Solution {
    public int[] shuffle(int[] nums, int n) {
        if(n == 1) return nums;
        if(n == 2) return nums;
        int m = 2*n;
        int [] nn = new int[n];
        int j=1, k=m/2;

        nn[0] = nums[0];
        nn[1] = nums[m/2];
        for(int i=2; i<m; i++){
            if(i%2==0){
                nn[j++] = nums[i];
            }
            else {
                nn[k++] = nums[i];
            }
        }
        return nn;
    }
    public static void main(String[] args) {
        int arr[] = new int[6]{2,5,1,3,4,7};
        System.out.println(shuffle([2,5,1,3,4,7],3));
    }
}