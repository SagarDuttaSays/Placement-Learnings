class Zigzag_Conversion {
      public String convert(String s, int numRows) {
        if(numRows<2)
            return s;
        String[] ans = new String[numRows];
        Arrays.fill(ans, "");
        int idx = 0;
        boolean flag = false;
        for(char ch: s.toCharArray()){
            if(!flag){
                ans[idx] = ans[idx]+ch+"";
                idx++;
                if(idx==numRows){
                    flag = !flag;
                    idx = idx-2;
                }
            } else {
                ans[idx] = ans[idx] + ch+"";
                idx--;
                if(idx==-1){
                    flag = !flag;
                    idx = 1;
                }
            }
        }
        String ot = "";
        for(int i = 0; i<numRows; i++)
            ot = ot+ans[i];
        return ot;
    }
}
