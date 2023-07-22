class Tower_Of_Hanoi {
    public void f(int n, int s, int h, int d, List<String> list){
        if(n==1){
            list.add(s+"->"+d);
            System.out.println("move disk "+n+" from rod "+s+" to rod "+d);
            return;
        }
        f(n-1, s, d, h, list);
        list.add(s+"->"+d);
        System.out.println("move disk "+n+" from rod "+s+" to rod "+d);
        f(n-1, h, s, d, list);
        
    }
    public long toh(int n, int s, int d, int h) {
        // Your code here
        List<String> list = new ArrayList<>();
        f(n, s, h, d, list);
        return list.size();
    }
}