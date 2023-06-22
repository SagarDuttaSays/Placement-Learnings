
class Remove_Stones_to_Minimize_the_Total {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int i: piles)
            q.add(i);
        for(int i = 0; i<k; i++){
            int value = q.remove();
            value = (value%2==1)? 1+(value/2) : value/2;
            q.add(value);
        }
        int sum = 0;
        for(int i: q)
            sum += i;
        return sum;
    }
}