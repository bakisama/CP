class Solution {
public:
    bool isPalindrome(int x) {
        if(x<0){
            return false;
        }
        long rev = 0;
        int copy = x;
        while(x!=0){
            rev*=10;
            rev += x%10;
            x/=10;
        }
        // bool ans = copy==rev?true:false;
        return copy==rev?true:false;
    }
};