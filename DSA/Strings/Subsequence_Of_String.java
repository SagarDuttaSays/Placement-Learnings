public class String_Subsequence_Of_String {
    public boolean isSubsequence(String s1, String s2){
        int j = 0;
        for(int i = 0; i<s1.length(); i++){
            char cs1 = s1.charAt(i);
            char cs2 = s2.charAt(j);
            if(cs1==cs2)
                j++;
        }
        if(j==s2.length())
            return true;
        else
            return false;
    }
    public static void main(String args[]){
        String s1 = "abcde";
        String s2 = "aed";
        String_Subsequence_Of_String ob = new String_Subsequence_Of_String();
        System.out.println(ob.isSubsequence(s1, s2));
    }
    
    
}