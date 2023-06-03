import java.util.*;
public class Second_Largest_Element {
    public int largest_element(int[] num){
       int max = 0;
       int secondMax = -1;
       for(int i = 0; i<num.length; i++){
           if(num[i]>num[max]){
               secondMax = max;
               max = i;
           }
       }
       return secondMax;
    }
    public static void main(String args[]){
        Largest_Element ob = new Largest_Element();
        int[] num = {4,5,1,2,3};
        System.out.println(ob.largest_element(num));
        }
}