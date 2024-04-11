class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l = new ArrayList<>();
        if(numRows <=0)
        {
            return l;
        }
       // l.add(0).add(1);
        for(int i = 0;i<numRows;i++)
        {
            List<Integer> ll = new ArrayList<>();
            for(int j = 0;j<=i;j++)
            {
               if(j==0 || j==i)
               {
                ll.add(1);
               }
               else
               {
                int s = (l.get(i-1).get(j-1)+l.get(i-1).get(j));
                ll.add(s);
               }
            }
            l.add(ll);
        }
        return l;
    }
}

