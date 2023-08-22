class Triangle {
      public int minimumTotal(List<List<Integer>> list) {
        for(int i = 0; i<list.size(); i++){
            for(int j = 0; j<list.get(i).size(); j++){
                if(i==0 && j==0)
                    continue;
                int x = Integer.MAX_VALUE;
                if(i-1>=0 && i-1>=j)
                    x = Math.min(x, list.get(i).get(j) + list.get(i-1).get(j));
                if(i-1>=0 && j-1>=0)
                    x = Math.min(x, list.get(i).get(j) + list.get(i-1).get(j-1));
                list.get(i).set(j, x);
            }
        }
        int sum = Integer.MAX_VALUE;
        for(int i = 0; i<list.size(); i++)
            sum = Math.min(sum, list.get(list.size()-1).get(i));
        return sum;
    }
}
