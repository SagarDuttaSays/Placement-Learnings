public class Check_If_Array_Is_Sorted{
    public static boolean check_if_array_is_sorted(int[] arr){
        int n = arr.length;
        if(n<=1)
        return true;
        for(int i = 1; i<n; i++)
            if(arr[i-1]>arr[i])
                return false;
        return true;
    }
    public static void main(String []args){
        int arr[] = {5,12,30,2,35};
        System.out.println(check_if_array_is_sorted(arr));
     }
}