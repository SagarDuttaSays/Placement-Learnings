class First_Unique_Character { 
    public int firstUniqChar(String s) { 
        Map<Character, Integer> map = new LinkedHashMap<>();
        char unique = ' ';
        for(int i = 0; i<s.length(); i++){
            char key = s.charAt(i);
            if(map.containsKey(key)){
                int freq = map.get(key);
                freq++;
                map.put(key, freq);
            }
            else {
                map.put(key, 1);
            }
        }
        Iterator<Character> it = map.keySet().iterator();
        while(it.hasNext()){
            char key = (char)it.next();
            if(map.get(key)==1){
                unique = key;
                break;
            }
        }
        if(unique!=' ')
            for(int i = 0; i<s.length(); i++)
                if(unique==s.charAt(i))
                    return i;
        return -1;
    }
}
