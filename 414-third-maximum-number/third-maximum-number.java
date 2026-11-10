class Solution {
    public int thirdMax(int[] nums) {
        int largest = nums[0];
        int sLargest = Integer.MIN_VALUE;
        int tLargest = Integer.MIN_VALUE;

        boolean hasSecond = false;
        boolean hasThird = false;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == largest || 
                (hasSecond && nums[i] == sLargest) ||
                (hasThird && nums[i] == tLargest)) {
                continue;
            }

            if (nums[i] > largest) {
                tLargest = sLargest;
                hasThird = hasSecond;

                sLargest = largest;
                hasSecond = true;

                largest = nums[i];

            } else if (!hasSecond || nums[i] > sLargest) {
                tLargest = sLargest;
                hasThird = hasSecond;

                sLargest = nums[i];
                hasSecond = true;

            } else if (!hasThird || nums[i] > tLargest) {
                tLargest = nums[i];
                hasThird = true;
            }
        }

        return hasThird ? tLargest : largest;
    }
}