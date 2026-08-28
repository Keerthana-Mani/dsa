class Solution {
    public boolean isHappy(int n) { 
       HashSet<Integer> set = new HashSet<>();

while (n != 1) {

    if (set.contains(n)) {
        return false;
    }

    set.add(n);

    int s = 0;

    while (n > 0) {
        int t = n % 10;
        s += t * t;
        n = n / 10;
    }

    n = s;
}

return true;
    }
   
}