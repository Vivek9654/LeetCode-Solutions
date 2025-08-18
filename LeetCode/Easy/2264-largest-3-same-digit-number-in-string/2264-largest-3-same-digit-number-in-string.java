
class Solution {
    public String largestGoodInteger(String num) {

   int n=num.length();
        String largest ="" ;
         for(int i=0;i<=n-3;i++){
            String sub= num.substring(i,i+3);
            if(sub.charAt(0)==sub.charAt(1)&&sub.charAt(1)==sub.charAt(2)){
                if(largest.isEmpty() || sub.compareTo(largest)>0){
                    largest=sub;
                }
            }
         }
        return largest;
    }
}