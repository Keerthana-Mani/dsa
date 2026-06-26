class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int i = num.length - 1;  // start from last element
        int carry = 0;

        while (i >= 0 || k > 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) {
                sum += num[i];   // add array element
                i--;
            }

            if (k > 0) {
                sum += k % 10;   // add last digit of k
                k = k / 10;      // remove last digit of k
            }

            carry = sum / 10;        // get carry
            result.add(0, sum % 10); // add remainder at FRONT of list
        }

        return result;
    }
}