import java.util.*;
public class Leftmost_Repeating_Character {
    public int leftmost_repeating_character(String s){
        char output=' ';
        Map<Character, Integer> map = new LinkedHashMap<>();
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
            int freq = map.get(key);
            if(freq>1){
                output = key;
                break;
            }
        }
        if(output!=' ')
        for(int i = 0; i<s.length(); i++){
            if(output==s.charAt(i))
                return i;
        }
        return -1;
    }
    public static void main(String args[]){
        Leftmost_Repeating_Character ob = new Leftmost_Repeating_Character();
        String s = "abcd";
        System.out.println(ob.leftmost_repeating_character(s));
        }
}