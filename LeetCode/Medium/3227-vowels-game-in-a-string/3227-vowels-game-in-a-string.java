class Solution {

     public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }


  
    public boolean doesAliceWin(String s) {
      int n=s.length();
       int count=0;
     for(int i=0;i<n;i++){
        char ch= s.charAt(i);
      
        if(isVowel(ch)) return true;

     }
    
     
    //   if(count==0) return false;
    //   if(count%2!=0) return true;
 
    //  if(count%2!=0) return true;
     
    
        
        return false;
    }
}