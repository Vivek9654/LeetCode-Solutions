class Solution {

    public static boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    public int maxFreqSum(String s) {

        int[] freq = new int[26];
         int maxvow=0,maxconst=0;
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }


        for(int i=0;i<26;i++){
            char ch=(char) (i+'a');
            if(isVowel(ch)){
                if(freq[i]>maxvow){
                    maxvow= freq[i];
                }
            }else{
                if(freq[i]>maxconst){
                    maxconst=freq[i];

                }
            }
        }

       return maxvow+maxconst;
    }
}