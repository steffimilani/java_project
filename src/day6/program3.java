import java.util.*;

class Solution {
    public int minimumIncompatibility(int[] nums, int k) {

        int n = nums.length;
        int size = n / k;

        int total = 1 << n;
        int[] cost = new int[total];

        Arrays.fill(cost, -1);

        // Generate valid subsets and their incompatibility
        for (int mask = 0; mask < total; mask++) {

            if (Integer.bitCount(mask) != size)
                continue;

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            Set<Integer> set = new HashSet<>();
            boolean valid = true;

            for (int i = 0; i < n; i++) {

                if ((mask & (1 << i)) != 0) {

                    if (set.contains(nums[i])) {
                        valid = false;
                        break;
                    }

                    set.add(nums[i]);

                    min = Math.min(min, nums[i]);
                    max = Math.max(max, nums[i]);
                }
            }

            if (valid) {
                cost[mask] = max - min;
            }
        }


        int[] dp = new int[total];
        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[0] = 0;


        for (int mask = 0; mask < total; mask++) {

            if (dp[mask] == Integer.MAX_VALUE)
                continue;

            // choose first remaining element
            int first = -1;

            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) == 0) {
                    first = i;
                    break;
                }
            }

            if (first == -1)
                continue;


            // Try adding valid subsets containing first element
            for (int sub = 0; sub < total; sub++) {

                if ((sub & (1 << first)) == 0)
                    continue;

                if ((sub & mask) != 0)
                    continue;

                if (cost[sub] == -1)
                    continue;


                dp[mask | sub] = Math.min(
                        dp[mask | sub],
                        dp[mask] + cost[sub]
                );
            }
        }

        return dp[total - 1] == Integer.MAX_VALUE ? -1 : dp[total - 1];
    }
}
