class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
    int digit=0;
    while(n!=0){
        digit = n%10;
        sum += digit;
        product *= digit;
        n /= 10;
    }
    return(product-sum);
    }
}