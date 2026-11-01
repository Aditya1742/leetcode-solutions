class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        // Better Approach Using HashSet
        Set<List<Integer>> st = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                Set<Long> hashset = new HashSet<>();
                for(int k = j+1; k < nums.length; k++) {
                    long sum = (long) nums[i]+nums[j]+nums[k];
                    long fourth =(long) target - (sum);
                    if(hashset.contains(fourth)) {
                        List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k],(int) fourth);
                        Collections.sort(temp);
                        st.add(temp);
                    }
                    hashset.add((long) nums[k]);
                }
            }
        }
        return new ArrayList<>(st);
    }
}