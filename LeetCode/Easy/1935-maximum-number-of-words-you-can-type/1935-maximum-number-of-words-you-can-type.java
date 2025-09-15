class Solution {

    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        char[] broken = brokenLetters.toCharArray();
        int result = 0;

        outer: for (String word : words) {
            for (char c : word.toCharArray()) {
                for (char b : broken) {
                    if (c == b) {
                        continue outer;
                    }
                }
            }
            result++;
        }

        return result;
    }

}
