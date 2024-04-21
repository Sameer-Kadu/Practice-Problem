class Solution {
    public boolean detectCapitalUse(String word) {
        int countUpperCase = 0;
        
        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                countUpperCase++;
            }
        }
        
        return countUpperCase == 0 || countUpperCase == word.length() || (countUpperCase == 1 && Character.isUpperCase(word.charAt(0)));
    }
}
