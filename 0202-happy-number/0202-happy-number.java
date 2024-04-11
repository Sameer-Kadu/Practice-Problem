class Solution {
    public boolean isHappy(int n) {
        int r =0;
        if(n == 58)
        {
            return false;
        }
        if(n == 1)
        {
            return true;
        }
        while(n!=0)
        {
            int k = (int)Math.pow(n%10,2);
            n=n/10;
            r = r+k;
        }
        return isHappy(r);
        
}
}