class Solution {
public:
    bool isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int rev = 0;
        int copy = x;
        while(x!=0){
            if ((rev > INT_MAX / 10) || (rev < INT_MIN / 10)){
                return 0;
            } 
            rev*=10;
            rev += x%10;
            x/=10;
        }
        bool ans = copy==rev?true:false;
        return ans;
    }
};