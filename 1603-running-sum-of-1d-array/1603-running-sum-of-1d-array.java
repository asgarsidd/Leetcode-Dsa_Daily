class Solution {
    public int[] runningSum(int[] n) {
        int sum=0;
        int[] arr = new int[n.length];
        for(int i = 0; i<n.length; i++){
            sum += n[i];
            arr[i] = sum;
        }
        return arr;
    }
}