class Solution {
    private int value(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public int romanToInt(String s) {
        if (s.isEmpty())
            return 0;
        // HashMap<Character, Integer> map = new HashMap<>();

        // map.put('I', 1);
        // map.put('V', 5);
        // map.put('X', 10);
        // map.put('L', 50);
        // map.put('C', 100);
        // map.put('D', 500);
        // map.put('M', 1000);

        // int sum = map.get(s.charAt(0));
        // for (int i = 1; i < s.length(); i++) {

        //     int curr = map.get(s.charAt(i));
        //     int prev = map.get(s.charAt(i - 1));

        //     if (curr > prev) {
        //         sum += (curr - 2 * prev);
        //     } else
        //         sum += curr;
        // }
        // return sum;
        
        // using switch statement
        int sum = value(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {

            int curr = value(s.charAt(i));
            int prev = value(s.charAt(i - 1));

            if (curr > prev) {
                sum += (curr - 2 * prev);
            } else
                sum += curr;
        }
        return sum;

    }
}