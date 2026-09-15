class Solution {
    public int[] sumZero(int n) {
        int[] answer = new int[n];

        int index = 0;

        for (int i = 1; i <= n / 2; i++) {
            answer[index] = -i;
            answer[index + 1] = i;

            index += 2;
        }

        if (n % 2 != 0) {
            answer[n - 1] = 0;
        }

        return answer;
    }
}