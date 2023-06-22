
class Average_Waiting_Time {
    public double averageWaitingTime(int[][] customers) {
        double currTime = customers[0][0], wt = 0;
        for(int i = 0; i<customers.length; i++){
            if(currTime<customers[i][0])
                currTime = customers[i][0] + customers[i][1]; 
            else currTime = currTime + customers[i][1] ;   
            wt = wt + (currTime - customers[i][0]); 
        }
        return wt/customers.length;
    }
}