
class Take_Gifts_From_the_Richest_Pile {
    public long pickGifts(int[] gifts, int k) {
        List<Integer> list = new ArrayList<>();
        for(int i: gifts)
            list.add(i);
        for(int i = 0; i<k; i++){
            Collections.sort(list, Collections.reverseOrder());
            int value = list.get(0);
            list.remove(0);
            value = (int)Math.sqrt(value);
            list.add(value);
        }
        long sum = 0;
        for(int i: list)
            sum += i;
        return sum;
    }
}