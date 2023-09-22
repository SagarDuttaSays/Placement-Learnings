import java.util.*;
public class Group_Anagram {
    public List<List<String>> groupAnagrams(String[] strs){ 
        List <List<String>> list = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0; i<strs.length; i++){
            char arr[] = strs[i].toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            List<String> tempList;
            if(map.containsKey(key)){
                tempList = map.get(key);
                tempList.add(strs[i]);
                map.put(key, tempList);
            }
            else {
                tempList = new ArrayList<>();
                tempList.add(strs[i]);
                map.put(key, tempList);
            }
        }
        Iterator<String> it = map.keySet().iterator();
        while(it.hasNext()){
            String key = it.next().toString();
            list.add(map.get(key));
        }
        return list;
    }
    public static void main(String args[]){
        Group_Anagram ob = new Group_Anagram();
        String strs[] = {"a"}; 
        List<List<String>> list = ob.groupAnagrams(strs);
        for(Object obj: list)
            System.out.print(obj+" ");
    }
    
    
}
