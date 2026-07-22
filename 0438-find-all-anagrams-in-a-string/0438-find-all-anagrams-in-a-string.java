class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        if (s.length() < p.length()) return ans;

        HashMap<Character, Integer> pMap = new HashMap<>();
        HashMap<Character, Integer> wMap = new HashMap<>();

        // Frequency of p
        for (char c : p.toCharArray()) {
            pMap.put(c, pMap.getOrDefault(c, 0) + 1);
        }

        int k = p.length();

        // First window
        for (int i = 0; i < k; i++) {
            char c = s.charAt(i);
            wMap.put(c, wMap.getOrDefault(c, 0) + 1);
        }

        if (pMap.equals(wMap)) {
            ans.add(0);
        }

        // Sliding window
        for (int i = k; i < s.length(); i++) {

            char remove = s.charAt(i - k);
            wMap.put(remove, wMap.get(remove) - 1);
            if (wMap.get(remove) == 0) {
                wMap.remove(remove);
            }

            char add = s.charAt(i);
            wMap.put(add, wMap.getOrDefault(add, 0) + 1);

            if (pMap.equals(wMap)) {
                ans.add(i - k + 1);
            }
        }

        return ans;
    }
}