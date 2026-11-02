class Solution {
    public String removeOccurrences(String s, String part) {
        while(!s.isEmpty() && s.contains(part)) {
            s = s.replaceFirst(part, "");
        }
        return s;
    }
}