/*package whatever //do not write package name here */
import java.util.*;
import java.io.*;

class Move_all_negative_numbers_to_beginning {
    public static void shiftAllNegatives(int[] arr){
        Arrays.sort(arr);
    }
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i = 0; i<n; i++)
	        arr[i] = sc.nextInt();
	    shiftAllNegatives(arr);
	    for(int i: arr)
	        System.out.print(i+" ");
	}
}