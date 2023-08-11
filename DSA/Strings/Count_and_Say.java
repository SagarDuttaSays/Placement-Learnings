class Count_and_Say {
      public String f(int count, int n, String s){
        if(count==n)
            return s;
        String ans = "";
        //1121
        int c = 1;
        for(int i = 1; i<s.length(); i++){
            if(s.charAt(i-1)==s.charAt(i))
                c++;
            else {
                ans = ans + c + s.charAt(i-1);
                c = 1;
            }
        }
        ans = ans + c + s.charAt(s.length()-1);
        return f(count+1, n, ans);
    }
    public String countAndSay(int n) {
        String ans = f(1, n, "1");
        return ans;
    }
}
