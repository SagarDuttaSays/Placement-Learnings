class Rat_in_a_Maze_Problem_I {
public static void f(int row, int col, int[][] arr, String p, List<String> list){
        if(row==arr.length-1 && col==arr.length-1){
            list.add(new String(p));
            return;
        }
        //down
        if(row<arr.length-1 && arr[row+1][col]==1){
            arr[row+1][col] = 0;
            f(row+1, col, arr, p+"D", list);
            arr[row+1][col] = 1;
        }
        //left
        if(col>0 && arr[row][col-1]==1){
            arr[row][col-1] = 0;
            f(row, col-1, arr, p+"L", list);
            arr[row][col-1] = 1;
        }
        //right
        if(col<arr.length-1 && arr[row][col+1]==1){
            arr[row][col+1] = 0;
            f(row, col+1, arr, p+"R", list);
            arr[row][col+1] = 1;
        }
        //up
        if(row>0 && arr[row-1][col]==1){
            arr[row-1][col] = 0;
            f(row-1, col, arr, p+"U", list);
            arr[row-1][col] = 1;
        }
    }
    public static ArrayList<String> findPath(int[][] arr, int n) {
        // Your code here
        ArrayList<String> list = new ArrayList<>();
        if(arr[0][0]==0){
            list.add("-1");
        } else {
            arr[0][0] = 0;
            f(0,0, arr, "", list);
        }
        return list;
    }
}