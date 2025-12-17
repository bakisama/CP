class Solution {
public:
    int fib(int n) {
        if (n == 1 || n==0) return n;
        else {
            int prev2=0;
            int prev1=1;
            int curr=-1;
            for(int i=2;i<=n;i++){
            curr=prev1+prev2;
            prev2=prev1;
            prev1=curr;
        }
        return curr;
        }
    }
};