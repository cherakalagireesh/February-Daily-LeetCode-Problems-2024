class Solution {
    public boolean isPathCrossing(String path) {
         
        Set<List<Integer>> set= new HashSet<>();
        int i = 0;
        int j = 0;

        set.add(Arrays.asList(i, j));

        for(char ch : path.toCharArray())
        {
            if(ch == 'N')
                j++;
            else if(ch == 'E')
                i++;
            else if(ch == 'S')
                j--;
            else
                i--;
            
            List<Integer> list = Arrays.asList(i, j);

            if(set.contains(list))
                return true;
            else
                set.add(list);
        }

        return false;
    }
}