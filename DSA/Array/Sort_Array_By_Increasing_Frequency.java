import java.util.*;
public class Sort_Array_By_Increasing_Frequency{
    public static void sortBasedOnFrequency(int[] nums){
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for(int key: nums)
            map.put(key, map.getOrDefault(key,0)+1);
        Comparator<Integer> c = (a,b) -> {
          int freq =  map.get(a).compareTo(map.get(b));
          if(freq!=0)
            return freq;
          else
            return b.compareTo(a);
        };
        Integer[] temp = new Integer[nums.length];
        for(int i = 0; i<nums.length; i++)
            temp[i] = nums[i];
        Arrays.sort(temp, c);
        for(int i = 0; i<nums.length; i++)
            nums[i] = temp[i];
    }
    public static void main(String []args){
        int nums[] = {10,20,10,10,20,30,40,30};
        System.out.println("before");
        for(int i = 0; i<nums.length; i++)
            System.out.print(nums[i]+" ");
        sortBasedOnFrequency(nums);
        System.out.println("\n after");
        for(int i = 0; i<nums.length; i++)
            System.out.print(nums[i]+" ");
     }
}