class Solution {
    public int kEmptySlots(int[] bulbs, int K) {
        TreeSet<Integer> active = new TreeSet();
        int day = 0;
        for (int bulb: bulbs) {
            ++day;
            active.add(bulb);
            Integer lower = active.lower(bulb);
            Integer higher = active.higher(bulb);
            if ((lower != null && (bulb - lower - 1) == K) || (higher != null && (higher - bulb - 1) == K))
                return day;
        }
        return -1;
    }
}
// Given an integer K, find the earliest day number such that there exists
// two turned on bulbs that have exactly K bulbs between them that are turned off

// If bulbs = [1, 3, 2], that means on the first day, the first bulb is turned on
// So, [1,0,0]. On the second day, the third bulb is turned on, so [1,0,1]. And 
// on the third day, the second bulb is turned on, so [1,1,1]. The answer is 
// two because on the second day there were two bulbs with exactly k = 1 bulb(s)
// between them turned off. 

// Obviously for this problem you have to watch out for stupid index things, but
// if you're aware of those it's not that bad

