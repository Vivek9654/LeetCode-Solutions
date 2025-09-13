class Solution {

    public static boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    public int maxFreqSum(String s) {

        int[] freq = new int[26];
        int maxvow = 0, maxconst = 0;
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        // for(int i=0;i<26;i++){
        //     char ch=(char) (i+'a');
        //     if(isVowel(ch)){
        //         if(freq[i]>maxvow){
        //             maxvow= freq[i];
        //         }
        //     }else{
        //         if(freq[i]>maxconst){
        //             maxconst=freq[i];

        //         }
        //     }
        // }

        ///little but more optimised
        for (int i = 0; i < 26; i++) {
            char ch = (char) (i + 'a');

            if (isVowel(ch))
                maxvow = Math.max(maxvow, freq[i]);

            else
                maxconst = Math.max(maxconst, freq[i]);
        }

        return maxvow + maxconst;
    }
}