class Solution {
    public int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        int highestAltitude = 0;

        for (int value : gain) {
            currentAltitude += value;
            highestAltitude = Math.max(highestAltitude, currentAltitude);
        }

        return highestAltitude;
    }
}

