class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int digit = 0;
        int carry = 0;
        List<Integer> output = new ArrayList<>();
        for(int i = num.length - 1; i >= 0; i-- ) {
            int rem = k % 10;
            int sum = num[i] + rem + carry;
            digit = sum % 10;
            carry = sum / 10;
            k = k / 10;
            output.add(0, digit);

        }
        while(k > 0 || carry > 0) {
            int rem = k % 10;
            int sum = rem + carry;
            digit = sum % 10;
            carry = sum / 10;
            k = k / 10;
            output.add(0, digit);
        }
        return output;
        
    }
}