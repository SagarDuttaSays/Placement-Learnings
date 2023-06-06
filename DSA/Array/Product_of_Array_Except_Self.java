class Product_of_Array_Except_Self {
    public int[] productExceptSelf(int[] nums) {
        boolean flag = false;
        List<Integer> list = new ArrayList<>();
        int arr[] = new int[nums.length];
        for(int i = 0; i<nums.length; i++)
            if(nums[i]==0){
                flag=true;
                list.add(i);
            }
        if(flag==false){
        int slider = 1;
        for(int i = 1; i<nums.length; i++)
            slider = slider*nums[i];
        arr[0] = slider;
        for(int i = 1; i<nums.length; i++){
            slider = (nums[i-1]*slider)/nums[i];
            arr[i] = slider;
            }
        }
        else {
            Arrays.fill(arr, 0);
            if(list.size()>1)
                return arr;
            int slider = 1;
            for(int i = 0; i<nums.length; i++)
                if(list.contains(i)==false)
                    slider = slider * nums[i];
            arr[list.get(0)] = slider;
        }
        return arr;
        }
    }