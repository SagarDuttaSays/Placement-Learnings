import java.util.*;
public class Pattern_Searching{
    public static List<Integer> pattern_searching(String s, String p){
        long hashP = p.hashCode();
        int slen = s.length();
        int plen = p.length();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<slen-plen+1; i++){
            long hashS = s.substring(i,i+plen).hashCode();
            if(hashP==hashS)
                list.add(i);
        }
        return list;
    }
     public static void main(String []args){
        String s = "geeksforgeeks";
        String p = "eks";
        System.out.println(pattern_searching(s,p));
     }
}