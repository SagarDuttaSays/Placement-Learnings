class Longest_Palindrome_in_a_String {
      static String f(int left, int right, String s){
        while(0<=left && right<=s.length()-1 && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1, right);
    }
    static String longestPalin(String S){
        // code here
        String max = "";
        for(int i = 0; i<S.length(); i++){
            String odd = f(i, i, S);
            if(odd.length()>max.length())
                max = odd;
            String even = f(i, i+1, S);
            if(even.length()>max.length())
                max = even;
        }
        return max;
    }
}
