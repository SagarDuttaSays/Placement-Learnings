import java.util.*; 
public class Intersection_of_two_arrays{
    public static int intersection_of_two_arrays(int[] num1, int[] num2){
        Set<Integer> set = new LinkedHashSet<>();
        int count = 0;
        for(int i = 0; i<num1.length; i++){
            set.add(num1[i]);
        }
        for(int i = 0; i<num2.length; i++){
            if(set.contains(num2[i])){
                count++;
                set.remove(num2[i]);
            }
        }
        return count;
    }
     public static void main(String []args){
         int arr1[] = {10,15,20,15,30,30,5};
         int arr2[] = {30,5,30,8};
        System.out.println(intersection_of_two_arrays(arr1,arr2));
     }
}
