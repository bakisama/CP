class Solution {
    public int hammingWeight(int n) {
        int ones=0;
        int digit;
        while(n!=0){
            digit=n%2;
            if(digit==1){
                ones++;
            }
            n/=2;
        }
        return ones;
    }
}