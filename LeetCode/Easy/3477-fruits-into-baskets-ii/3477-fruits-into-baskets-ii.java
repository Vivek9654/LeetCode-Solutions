import java.util.*;

// class Solution {
//     public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
//         int n = fruits.length,used=0;
//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<n;j++)
//             {
//                 if(fruits[i]<=baskets[j])
//                 {
//                     used++;
//                     baskets[j] = -1;
//                     break;
//                 }
//             }
//         }
//         return n - used;
//     }
// }




// above one was very bruite force approach now lets optimise it further

// now below solution is optimise for O(nlogn)


class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] bask) {
        int n = fruits.length;
        TreeSet<Integer> aval = new TreeSet<>();
        for (int i = 0; i < n; i++) aval.add(i);
        int used = 0;
        for (int f : fruits) {
            Integer idx = aval.ceiling(0);
            while (idx != null && bask[idx] < f) idx = aval.higher(idx);
            if (idx != null) {
                used++;
                aval.remove(idx);
            }
        }
        return n - used;
    }
}

