class Solution {
    public int numberOfSteps(int num) {

        // iterative method
        // int count = 0;
        // while (num != 0) {
        //     if (num % 2 == 0) {
        //         num /= 2;
        //         count++;

        //     }else {
        //         num-=1;
        //         count++;
        //     }
        // }
        // return count;

// recursive method
        if (num == 0)
            return 0;

        if (num % 2 == 0) {

         return 1 + numberOfSteps(num / 2);
        } else {
          return 1 + numberOfSteps(num - 1);

        }

    }
}