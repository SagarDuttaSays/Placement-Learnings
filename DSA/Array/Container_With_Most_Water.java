class Container_With_Most_Water {
    public int maxArea(int[] arr) {
        int area = Integer.MIN_VALUE;
        int right = arr.length-1, left = 0;
        while(left<right){
            area = Math.max(area, (right-left)*Math.min(arr[right], arr[left]));
            if(arr[left]<arr[right])
                left++;
            else
                right--;
        }
        return area;
    }
}