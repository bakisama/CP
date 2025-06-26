class Solution {
    public int reverse(int x) {
        long int_max = Integer.MAX_VALUE;
        long int_min = Integer.MIN_VALUE;
        int reverse = 0;
        int digit;
        int i = 0;
        int duplicate = x;
        while (duplicate != 0) {
            duplicate /= 10;
            i++;
        }
        i-=1;
        while (x != 0) {
            digit = x % 10;
            x /= 10;
            reverse += Math.pow(10, i--) * digit;
            if (reverse >= int_max || reverse <= int_min) {
                return 0;
            }
        }
        return reverse;
    }
}