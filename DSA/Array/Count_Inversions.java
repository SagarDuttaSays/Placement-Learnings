class Count_Inversions {
public static long mergeSort(long[] arr, long[] temp, int left, int right) {
        long invCount = 0;

        if (left < right) {
            int mid = left + (right - left) / 2;
            invCount += mergeSort(arr, temp, left, mid);
            invCount += mergeSort(arr, temp, mid + 1, right);
            invCount += merge(arr, temp, left, mid + 1, right);
        }

        return invCount;
    }

    public static long merge(long[] arr, long[] temp, int left, int mid, int right) {
        int i = left;
        int j = mid;
        int k = left;
        long invCount = 0;

        while (i <= mid - 1 && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                invCount += mid - i;
            }
        }

        while (i <= mid - 1) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }

        return invCount;
    }
    static long inversionCount(long arr[], long N)
    {
        long[] temp = new long[(int)N];
        return mergeSort(arr, temp, 0,(int) N - 1);
    }
}