class Solution {

    public String makeFancyString(String s) {

        int n = s.length();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (i >= 2 && s.charAt(i) == s.charAt(i - 1) && s.charAt(i - 1) == s.charAt(i - 2)) {
                continue;
            }
            ans.append(s.charAt(i));
        }

        return ans.toString();
    }
}
