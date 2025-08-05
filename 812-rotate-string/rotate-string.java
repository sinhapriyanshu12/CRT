class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            s = s.substring(1) + s.charAt(0);  // Rotate left by 1
            if (s.equals(goal)) return true;
        }

        return false;
    }
}
