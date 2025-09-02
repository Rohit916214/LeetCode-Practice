class Solution {
    public int numberOfPairs(int[][] points) {
        int n = points.length;
        int totalPairs = 0;

        for (int i = 0; i < n; i++) {
            int ax = points[i][0];
            int ay = points[i][1];

            for (int j = 0; j < n; j++) {
                int bx = points[j][0];
                int by = points[j][1];

                // A must be upper-left of B (allow line case)
                if (ax <= bx && ay >= by && (ax < bx || ay > by)) {
                    boolean rectangleIsEmpty = true;

                    // Rectangle boundaries
                    int left = Math.min(ax, bx);
                    int right = Math.max(ax, bx);
                    int bottom = Math.min(ay, by);
                    int top = Math.max(ay, by);

                    for (int k = 0; k < n; k++) {
                        if (k == i || k == j) continue;
                        int cx = points[k][0];
                        int cy = points[k][1];

                        // If C lies inside rectangle (border inclusive)
                        if (cx >= left && cx <= right && cy >= bottom && cy <= top) {
                            rectangleIsEmpty = false;
                            break;
                        }
                    }

                    if (rectangleIsEmpty) {
                        totalPairs++;
                    }
                }
            }
        }
        return totalPairs;
    }
}
