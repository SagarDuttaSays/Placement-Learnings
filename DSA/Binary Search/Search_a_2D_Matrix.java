class Search_a_2D_Matrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int outerLeft = 0, outerRight = matrix.length-1;
        while(outerLeft<=outerRight){
            int outerMid = (outerLeft+outerRight)/2;
            int innerLeft = 0;
            int innerRight = matrix[outerMid].length-1;
            while(innerLeft<=innerRight){
                int innerMid = (innerLeft+innerRight)/2;
                if(matrix[outerMid][innerMid]==target)
                    return true;
                else if(matrix[outerMid][innerMid]<target)
                    innerLeft = innerMid+1;
                else if(matrix[outerMid][innerMid]>target)
                    innerRight = innerMid-1;
            }
            if(matrix[outerMid][0]>target)
                outerRight = outerMid-1;
            else
                outerLeft = outerMid+1;
        }
        return false;
    }
}