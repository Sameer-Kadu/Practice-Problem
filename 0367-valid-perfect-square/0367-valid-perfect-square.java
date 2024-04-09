class Solution {
    public boolean isPerfectSquare(int num) {
        int i=1;
        while(num > 0)
        {
            // if num - i = 0 squre exist
            //Repeatedly subtracting consecutive odd numbers from it
            //Subtract till the difference is zero
            //Number of times we subtract is the required square root
            num = num - i;
            i=i+2;
        }
        if(num < 0)
        {
            return false;
        }
        return true;
    }
}