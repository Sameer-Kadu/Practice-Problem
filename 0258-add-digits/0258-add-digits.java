
class Solution {
    public int addDigits(int num) {
        String s = Integer.toString(num);
        int r = 0;
        if (s.length() == 1)
        {
            return Integer.parseInt(s);
        }
        char a[] = s.toCharArray();
            for(int i=0;i<a.length;i++)
            {
                r = r+ Character.getNumericValue(a[i]);
            }
        return addDigits(r);
       
    }
}