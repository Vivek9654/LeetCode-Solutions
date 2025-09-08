class Solution {


    static  boolean containsZero(int num){

     while(num>0){
       if( num%10==0) return true;
       else num/=10; 
     }
      return false;

    }
    public int[] getNoZeroIntegers(int n) {
        int ans1 = 1, ans2 = n-ans1;
        
        
     
      

      while(containsZero(ans1)||containsZero(ans2)){
        ans1++;
        ans2=n-ans1;
      }


   

        return new int[] { ans1, ans2 };
    }
}