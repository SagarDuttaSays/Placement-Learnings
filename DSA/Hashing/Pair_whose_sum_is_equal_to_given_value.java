import java.util.*;
public class Pair_whose_sum_is_equal_to_given_value{
    public static boolean pair_whose_sum_is_equal_to_given_value(int[] nums, int sum){
        Set<Integer> set = new LinkedHashSet<>();
        for(int i = 0; i<nums.length; i++)
            set.add(nums[i]);
        Iterator<Integer> it= set.iterator();
        while(it.hasNext()){
            int complimentary = sum - (int)it.next();
            if(set.contains(complimentary))
                return true;
        }
        return false;
    }
    public static void main(String []args){
        int arr[] = {3,2,8,15,-8};
        int sum = 17;
        System.out.println(pair_whose_sum_is_equal_to_given_value(arr, sum));
     }
}