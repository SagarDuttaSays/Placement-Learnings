class Word_Search {
    static class Node {
        Node[] letters;
        boolean eow;
        
        Node() {
            letters = new Node[26];
            eow = false;
        }
    }
    
    public static void insert(String word, Node root) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.letters[idx] == null)
                curr.letters[idx] = new Node();
            if (i == word.length() - 1)
                curr.letters[idx].eow = true;
            curr = curr.letters[idx];
        }
    }
    
    public static boolean search(String word, Node root) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.letters[idx] == null)
                return false;
            if (i == word.length() - 1 && !curr.letters[idx].eow)
                return false;
            curr = curr.letters[idx];
        }
        return true;
    }
    
    public static boolean helper(String s, Node root, Boolean[] memo) {
        if (s.length() == 0)
            return true;
        
        if (memo[s.length()] != null)
            return memo[s.length()];
        
        for (int i = 1; i <= s.length(); i++) {
            String s1 = s.substring(0, i);
            String s2 = s.substring(i);
            
            if (search(s1, root) && helper(s2, root, memo)) {
                memo[s.length()] = true;
                return true;
            }
        }
        
        memo[s.length()] = false;
        return false;
    }
    
    public boolean wordBreak(String s, List<String> wordDict) {
        Node root = new Node();
        for (String str : wordDict)
            insert(str, root);
        
        Boolean[] memo = new Boolean[s.length() + 1];
        return helper(s, root, memo);
    }
}
