import java.util.*;
public class Largest_Element {
    public int largest_element(int[] num){
       int max = Integer.MIN_VALUE;
       int index = -1;
       for(int i = 0; i<num.length; i++){
           if(num[i]>max){
               max = num[i];
               index = i;
           }
       }
       return index;
    }
    public static void main(String args[]){
        Largest_Element ob = new Largest_Element();
        int[] num = {5,6,1,4,8,3};
        System.out.println(ob.largest_element(num));
        }
}