import java.util.*;
public class Union_of_two_arrays{
    public static int union_of_two_arrays(int[] num1, int[] num2){
        Set<Integer> set = new LinkedHashSet<>();
        for(int i = 0; i<num1.length; i++){
            set.add(num1[i]);
        }
        for(int i = 0; i<num2.length; i++){
            set.add(num2[i]);
        }
        return set.size();
    }
     public static void main(String []args){
         int arr1[] = {15,20,5,15};
         int arr2[] = {15,15,15,20,10};
        System.out.println(union_of_two_arrays(arr1,arr2));
     }
}