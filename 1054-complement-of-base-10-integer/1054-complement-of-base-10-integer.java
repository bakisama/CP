class Solution {
    public int bitwiseComplement(int n) {
        int power;
        if(n==0){
            return 1;
        }
        power = (int)Math.floor(Math.log(n)/Math.log(2));
        power++;
        int binarymax=(int)Math.pow(2,power);
        return(binarymax-n-1);

    }
}