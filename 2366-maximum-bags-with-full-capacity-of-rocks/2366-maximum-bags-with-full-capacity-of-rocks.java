class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        for(int i=0; i<capacity.length; i++) {
            capacity[i] -= rocks[i];
        }
            
        int i = 0;
        Arrays.sort(capacity);
        while(i < capacity.length && capacity[i] <= additionalRocks) {
            additionalRocks -= capacity[i];
            i++;
        }
        return i;
    }
}