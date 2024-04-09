class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 0) // Special case: 0 is a perfect square
            return true;
        
        long left = 1; // Start from 1
        long right = num; // End at num
        
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;
            
            if (square == num)
                return true;
            else if (square < num)
                left = mid + 1;
            else
                right = mid - 1;
        }
        
        return false;
    }
}
