
class Minimum_Operations_to_Halve_Array_Sum {
    public int halveArray(int[] nums) {
    double s = 0, k = 0; int i = 0;
    PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
    for (int x: nums) { 
        pq.offer((double)x); 
        s += x; 
    }
    while (s - k > s / 2) {
        double x = pq.poll();
        k += x / 2;
        pq.offer(x / 2);     
        i++;
    }
    return i;
    }
}