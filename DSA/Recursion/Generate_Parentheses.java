class Generate_Parentheses {
      public void f(int n, int lb, int rb, String str, List<String> list){
        if(lb==n && rb==n){
            if(!list.contains(str))
                list.add(new String(str));
            return;
        }
        //add left bracket
        if(n>lb)
            f(n, lb+1, rb, str+"(", list);
            
        //right bracket
        if(lb>rb)
            f(n, lb, rb+1, str+")", list);
    }
      
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        f(n,0,0,"",list);
        return list;
    }
}
