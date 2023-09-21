class Solution {
    public int maximumWealth(int[][] acounts) {
        int max = Integer.MIN_VALUE; 
        for(int i = 0; i<acounts.length; i++){
            int sum  = 0;
            for(int j = 0; j<acounts[i].length; j++){
                 sum += acounts[i][j];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}