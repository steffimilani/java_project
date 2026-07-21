class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] allowedChars = new boolean[26];

        // Mark allowed characters
        for (char c : allowed.toCharArray()) {
            allowedChars[c - 'a'] = true;
        }

        int count = 0;

        // Check each word
        for (String word : words) {
            boolean consistent = true;

            for (char c : word.toCharArray()) {
                if (!allowedChars[c - 'a']) {
                    consistent = false;
                    break;
                }
            }

            if (consistent) {
                count++;
            }
        }

        return count;
    }
}