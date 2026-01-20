class Solution {
    public int[] bestTower(int[][] towers, int[] center, int radius) {

      

        int ans_x = -1;
        int ans_y = -1;
        int q = -1;

        for(int i = 0 ; i < towers.length; i++){

            int x = towers[i][0];
            int y = towers[i][1];
            int quality = towers[i][2];
            

            int mahantan_Distance = Math.abs(x - center[0]) + Math.abs(y - center[1]);

            if(mahantan_Distance <= radius){
            if (quality > q) {
                    q = quality;
                    ans_x = x;
                    ans_y = y;
                }
                
                else if (quality == q) {
                    if (ans_x == -1 || x < ans_x || (x == ans_x && y < ans_y)) {
                        ans_x = x;
                        ans_y = y;
                    }
                }
            }

            
        }

        return new int[]{ans_x, ans_y};

        
        
        
        
    }
}