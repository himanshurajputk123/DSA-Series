class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int totalDis = 0;
        int cnt = 0;
        while(mainTank != 0){           
            totalDis += 10;
            mainTank--;
            cnt++;

            if(additionalTank != 0 && cnt == 5){
                additionalTank--;
                mainTank++;
                cnt = 0;
            }
        }
        return totalDis;
    }
}