class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        // alag alag calculate krunga
        long cost01 = (long) cost1 * need1 + (long) cost2 * need2;

        // costBoth se calculate krunga
        int need = Math.max(need1, need2);
        long cost02 = (long) need * costBoth;

        // agr cost 1 bada hai
        long cost03 = 0;
        if(need1 > need2){
            int remaining = need1 - need2;
            cost03 = (long) need2 * costBoth + (long) remaining * cost1;
        }else{
            int remaining = need2 - need1;
            cost03 = (long) need1 * costBoth + (long) remaining * cost2;
        }

        long ans = Math.min(cost01, cost02);
        ans = Math.min(ans, cost03);
        return ans;
    }
}