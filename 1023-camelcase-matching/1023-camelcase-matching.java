class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> ans = new ArrayList<>();
        for (String query : queries) {
            int j = 0;
            boolean match = true;
            for (char ch : query.toCharArray()) {
                if (j < pattern.length() && ch == pattern.charAt(j)) {
                    j++;
                }
                else if (Character.isUpperCase(ch)) {
                    match = false;
                    break;
                }
            }
            if (j != pattern.length()) {
                match = false;}ans.add(match);}

    return ans;
    }
}