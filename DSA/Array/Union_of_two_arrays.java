class Union_of_two_arrays {
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        Set<Integer> set = new LinkedHashSet<>();
        for(int i = 0; i<a.length; i++)
            set.add(a[i]);
        for(int i = 0; i<b.length; i++)
            set.add(b[i]);
        return set.size();
    }
}