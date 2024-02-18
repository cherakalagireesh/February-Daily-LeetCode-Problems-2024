class Solution {
    public int minAddToMakeValid(String s) {
        
       Stack<Character> openBrackets = new Stack<>();
       Stack<Character> closeBrackets = new Stack<>();

       for(char ch : s.toCharArray())
       {
            if(openBrackets.isEmpty() && ch == ')')
                closeBrackets.push(ch);
            else if(ch == '(')
                openBrackets.push(ch);
            else
                openBrackets.pop();
       }

       return openBrackets.size() + closeBrackets.size();
    }
}