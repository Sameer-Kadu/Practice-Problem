class Solution {
    public String toHex(int num) {
        if(num == 0){
            return "0";
        }
        // during operation it my exit the limit of int so initate with long "val"
        long val = num;
        if(num < 0){
            //Math.pow(2,32) = 100000000000000000000000000000000
            val = (long) (Math.pow(2,32) + num);
        }
        
        StringBuilder res = new StringBuilder();
        while (val != 0){
            int remainder = (int)(val % 16);
            val = val /16;
            if(remainder >= 10){
                // for 10 to 15 remainder
                // convert number to its equivalent ASCII code
                // a = 97, b = 98 and so on...
                //number type cast in char to convert number to its ASCII code ((char) (remainder + 87))
                res.append((char) (remainder + 87));
            }else {
                res.append(remainder);
            }
        }

        return res.reverse().toString();
    }
}