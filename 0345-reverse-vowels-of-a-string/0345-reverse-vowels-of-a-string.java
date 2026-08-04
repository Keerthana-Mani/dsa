class Solution {
    public String reverseVowels(String s) {

        String s1 = s.toLowerCase();
        char[] arr = s.toCharArray();

        int n = s.length();
        int l = 0;
        int r = n - 1;

        while (l < r) {

            if (s1.charAt(l) != 'a' &&
                s1.charAt(l) != 'e' &&
                s1.charAt(l) != 'i' &&
                s1.charAt(l) != 'o' &&
                s1.charAt(l) != 'u') {
                l++;
            }

            else if (s1.charAt(r) != 'a' &&
                     s1.charAt(r) != 'e' &&
                     s1.charAt(r) != 'i' &&
                     s1.charAt(r) != 'o' &&
                     s1.charAt(r) != 'u') {
                r--;
            }

            else {
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }

        return new String(arr);
    }
}