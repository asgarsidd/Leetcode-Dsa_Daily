class Solution {
    public int balancedStringSplit(String s) {
        int count = 0; 
        int total = 0;
        for(char ch : s.toCharArray()){
            if(ch == 'R')
            ++count;
            if(ch == 'L')
            --count;
            if(count == 0)
            ++total;
        }
        return total;
    }
}