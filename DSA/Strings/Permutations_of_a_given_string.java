class Permutations_of_a_given_string{
    public void helper(List<String> list, String s, String perm, int index){
        if(s.length()==0){
            if(!list.contains(perm))
                list.add(perm);
            return;
        }
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            String newStr = s.substring(0, i) + s.substring(i+1);
            helper(list, newStr, perm+ch, index+1);
        }
    }
    public List<String> find_permutation(String S) {
        List<String> list = new ArrayList<>();
        helper(list, S, "", 0);
        Collections.sort(list);
        return list;
    }
}