class Solution {
    public long flowerGame(int n, int m) {
        long countEvenInN = (n >> 1);
        long countEvenInM = (m >> 1);
        long countOddInN = (long) n - countEvenInN;
        long countOddInM = (long) m - countEvenInM;

        return (countEvenInN * countOddInM) + (countOddInN * countEvenInM);
    }
}