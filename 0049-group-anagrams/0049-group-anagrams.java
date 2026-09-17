class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();

        boolean[] visited = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {

            if (visited[i]) {
                continue;
            }

            List<String> group = new ArrayList<>();

            char[] a = strs[i].toCharArray();
            Arrays.sort(a);
            String sortedI = new String(a);

            group.add(strs[i]);
            visited[i] = true;

            for (int j = i + 1; j < strs.length; j++) {

                if (visited[j]) {
                    continue;
                }

                char[] b = strs[j].toCharArray();
                Arrays.sort(b);
                String sortedJ = new String(b);

                if (sortedI.equals(sortedJ)) {
                    group.add(strs[j]);
                    visited[j] = true;
                }
            }

            result.add(group);
        }

        return result;
    }
}