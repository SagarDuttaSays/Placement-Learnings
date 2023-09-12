class Rotate_Image {
    public void rotate(int[][] matrix) {
        for(int row = 0; row<matrix.length; row++){
            for(int col = row; col<matrix.length; col++) {
                int temp =  matrix[col][row];
                matrix[col][row] = matrix[row][col];
                matrix[row][col] = temp;
            }
        }
        
        for(int i = 0; i<matrix.length; i++){
            int low = 0, high = matrix.length-1;
            while(low<=high){
                int temp = matrix[i][low];
                matrix[i][low++] = matrix[i][high];
                matrix[i][high--] = temp;
            }
        }
    }
}
