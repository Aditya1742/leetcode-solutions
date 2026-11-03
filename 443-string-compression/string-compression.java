class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        if(chars.length == 1) {
            return 1;
        }
        int idx = 0;
        for(int i = 0; i < n; i++) {
            char ch = chars[i];
            int count = 0;
            while(i < n && chars[i] == ch) {
                count++; i++;
            }
            if(count == 1) {
                chars[idx] = ch;
                idx++;
            }else{
                chars[idx] = ch;
                idx++;
                String str = String.valueOf(count);
                for(int j = 0; j < str.length(); j++) {
                    chars[idx] = str.charAt(j);
                    idx++;
                }
            }
            i--;
        }
        return idx;
    }
}