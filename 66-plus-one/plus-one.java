class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> answer = new ArrayList<>();
        int index = 0;
        int carry = 0;
        int k = 1;
        for(int i = digits.length-1; i >= 0; i--) { 
            int sum = digits[i] + k + carry;
            int digit = sum % 10;
            carry = sum / 10;
            answer.add(0,digit);
            k = k / 10;
        }
        while(carry > 0) {
            int sum = carry;
            int digit = sum % 10;
            carry = sum / 10;
            answer.add(0,digit);
        }
        int[] output = new int[answer.size()];
        for(int i = 0; i < answer.size(); i++) {
            output[i] = answer.get(i);

        }
        return output;
    }
}