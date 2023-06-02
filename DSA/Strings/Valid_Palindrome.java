class Valid_Palindrome {
    public boolean isPalindrome(String s){
        String original = "", reversed = "";
        s = s.toLowerCase();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if('a'<=ch && ch<='z'){
                original = original + ch;
                reversed = ch + reversed;
            }
            else if('A'<=ch && ch<='Z'){
                original = original + ch;
                reversed = ch + reversed;
            }
            else if('0'<=ch && ch<='9'){
                original = original + ch;
                reversed = ch + reversed;
            }
        }
        if(original.equals(reversed))
        return true;
        else 
        return false;
    }
}