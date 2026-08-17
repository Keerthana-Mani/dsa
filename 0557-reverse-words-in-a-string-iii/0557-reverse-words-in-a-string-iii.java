class Solution {
    public String reverseWords(String s) {

        String[] s1 = s.split("\\s+");

        for (int i = 0; i < s1.length; i++) {

            char[] ch = s1[i].toCharArray();

            int l = 0;
            int r = ch.length - 1;

            while (l < r) {

                char temp = ch[l];
                ch[l] = ch[r];
                ch[r] = temp;

                l++;
                r--;
            }

            s1[i] = new String(ch);
        }

        return String.join(" ", s1);
    }
}