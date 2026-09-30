class Solution {
    public boolean isPossible(int[] position, int m, int n, int mid) {
        int ball = 1, lastbasposition = position[0];
        for(int i = 1; i < n; i++) {
            if((position[i] - lastbasposition) >= mid) {
                ball++;
                lastbasposition = position[i];
            }
            
        } 
        if(ball >= m) {
            return true;
        }
        return false;
    }
    //binary search
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n = position.length;
        int start = 0;
        int end = position[n-1] - position[0]; 
        int ans = -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(isPossible(position, m, n, mid)) {
                ans = mid;
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return ans;
    }
}