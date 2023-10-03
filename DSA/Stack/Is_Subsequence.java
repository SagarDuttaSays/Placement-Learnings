class Is_Subsequence{
    public boolean isSubsequence(String s, String t) { 
        
        if(t.length()<s.length())
            return false;
        if(s.length()==0)
            return true;
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i<s.length(); i++)
            stack.push(s.charAt(i));
        for(int i = t.length()-1; i>=0; i--){
            if(t.charAt(i)==stack.peek())
                stack.pop();
            if(stack.isEmpty())
                return true;
        }
        return stack.isEmpty()? true: false;
    }
}
