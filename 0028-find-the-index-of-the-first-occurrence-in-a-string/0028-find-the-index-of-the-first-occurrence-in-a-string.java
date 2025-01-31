public class Solution {
    public int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();
        int i = 0, j = 0, ind = 0;
        
        while (i < h && j < n) {
            ind = i;
            while (i < h && j < n && haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            }
            if (j >= n) return ind;
            else {
                j = 0;
                i = ind + 1;
            }
        }
        return -1;
    }
}