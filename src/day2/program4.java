class Solution {
    public int passThePillow(int n, int time) {
        int cycle = n - 1;
        int rounds = time / cycle;
        int rem = time % cycle;

        if (rounds % 2 == 0) {
            return rem + 1;
        } else {
            return n - rem;
        }
    }
}