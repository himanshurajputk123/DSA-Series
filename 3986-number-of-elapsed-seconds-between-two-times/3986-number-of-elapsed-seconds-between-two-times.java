class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        char[] etArr = endTime.toCharArray();
        char[] stArr = startTime.toCharArray();
        int minutes = 0;
        int seconds = 0;

        int hourEt = (etArr[0] - '0')*10 + etArr[1];
        int hourSt = (stArr[0] - '0')*10 + stArr[1];
        int hours = hourEt - hourSt;

        int minEt = (etArr[3] - '0')*10 + etArr[4];
        int minSt = (stArr[3] - '0')*10 + stArr[4];
        int mins = minEt - minSt;

        int secEt = (etArr[6] - '0')*10 + etArr[7];
        int secSt = (stArr[6] - '0')*10 + stArr[7];
        int sec = secEt - secSt;

        return (hours*3600+mins*60+sec);
    }
}