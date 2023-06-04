public class Move_Zeroes{
    public static void move_zeroes_to_the_end(int[] arr){
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count++] = temp;
            }
        }
    }
    public static void main(String []args){
        int arr[] = {8,5,0,10,0,20};
        move_zeroes_to_the_end(arr);
     }
}