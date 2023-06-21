class Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0 || s.length()==1)
            return s.length();
        List<Character> list = new ArrayList<>();
        int maxLen = 0;
        for(char i: s.toCharArray()){
            if(list.contains(i)){
                maxLen = Math.max(maxLen, list.size());
                int index = list.indexOf(i);
                list.subList(0, index+1).clear();
            }
            list.add(i);
            maxLen = Math.max(maxLen, list.size());
        }
        return maxLen;
    }
}