class Solution {
    public char findTheDifference(String s, String t) {
        int[] charCount = new int[26]; // Assuming input consists only of lowercase English letters
        
        // Count occurrences of each character in string s
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }
        
        // Subtract occurrences of characters in string t
        for (char c : t.toCharArray()) {
            charCount[c - 'a']--;
        }
        
        // Find the character with non-zero count
        for (int i = 0; i < 26; i++) {
            if (charCount[i] != 0) {
                return (char) (i + 'a');
            }
        }
        
        // In case input strings are not valid or there's no difference
        return '\0';
    }
}
