class Solution {
    public boolean isPalindrome(String s) {

        if (s.isEmpty()) {
            return true;
        }
            

        String no = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        String reversestr = new StringBuilder(no).reverse().toString();

        if (no.equals(reversestr)) {
            return true;
        }

        return false;
    }
}