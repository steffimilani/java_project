import java.util.*;

class Solution {
    public int slidingPuzzle(int[][] board) {
        String target = "123450";

        StringBuilder sb = new StringBuilder();
        for (int[] row : board) {
            for (int num : row) {
                sb.append(num);
            }
        }

        String start = sb.toString();

        int[][] neighbors = {
                {1, 3},        // 0
                {0, 2, 4},     // 1
                {1, 5},        // 2
                {0, 4},        // 3
                {1, 3, 5},     // 4
                {2, 4}         // 5
        };

        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.offer(start);
        visited.add(start);

        int moves = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                String curr = queue.poll();

                if (curr.equals(target))
                    return moves;

                int zero = curr.indexOf('0');

                for (int next : neighbors[zero]) {
                    char[] arr = curr.toCharArray();

                    char temp = arr[zero];
                    arr[zero] = arr[next];
                    arr[next] = temp;

                    String newState = new String(arr);

                    if (!visited.contains(newState)) {
                        visited.add(newState);
                        queue.offer(newState);
                    }
                }
            }
            moves++;
        }

        return -1;
    }
}