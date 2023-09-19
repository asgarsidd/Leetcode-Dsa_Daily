class Solution {
    public String interpret(String command) {
        StringBuilder str = new StringBuilder();
        int i = 0;
        
        while (i < command.length()) {
            if (command.charAt(i) == 'G') {
                str.append('G');
                i++;
            } else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                str.append('o');
                i += 2;
            } else if (command.charAt(i) == '(' && command.charAt(i + 1) == 'a') {
                str.append("al");
                i += 4;
            }
        }
        
        return str.toString();
    }
}
