import java.util.*;
public class Reverse_Words_In_A_String{
    public static String reverse_a_string(String s){
        String[] str = s.trim().split("\\s+");
        s = "";
        for(int i = str.length-1; i>=0; i--){
            s = s + str[i] + " ";
        }
        return s.trim();
    }
     public static void main(String []args){
        String s = " hello world ";
        System.out.println(reverse_a_string(s));
     }
}