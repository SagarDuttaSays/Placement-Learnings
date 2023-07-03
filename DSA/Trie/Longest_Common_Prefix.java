class Longest_Common_Prefix {
    static class Node{
        Node[] letters;
        boolean eow;
        Node(){
            letters = new Node[26];
            eow = false;
        }
    }
    static void insert(String word, Node root){
            Node curr = root;
            for(int i = 0; i<word.length(); i++){
                int idx = word.charAt(i) - 'a';
                if(curr.letters[idx]==null){
                    curr.letters[idx]= new Node();
                    //System.out.println("Added "+word.charAt(i));
                }
                if(i==word.length()-1)
                    curr.letters[idx].eow = true;
                curr = curr.letters[idx];
            }
    }
    public void helper(Node root, StringBuilder temp, StringBuilder ans){
        int c = 0;
        for(int i = 0; i<26; i++)
            if(root.letters[i]!=null)
                c++;
        if(c>1)
            return;

        for(int i = 0; i<26; i++)
            if(root.letters[i]!=null && root.letters[i].eow){
                temp.append((char)(i+'a'));
                if(ans.length()<temp.length())
                    ans.replace(0, ans.length(), temp.toString());
                return;
            }
            else if(root.letters[i]!=null && !root.letters[i].eow){
                temp.append((char)(i+'a'));
                if(ans.length()<temp.length())
                    ans.replace(0, ans.length(), temp.toString());
                helper(root.letters[i], temp, ans);
            }
    }
    //car carses carsing
    public String longestCommonPrefix(String[] strs) {
        Node root = new Node();
        for(String s: strs){
            if(s.equals(""))
                return "";
            insert(s, root);}
        StringBuilder ans = new StringBuilder();
        helper(root, new StringBuilder(), ans);
        return ans.toString();
}
}