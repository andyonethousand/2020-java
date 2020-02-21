class Solution {
    public int numJewelsInStones(String J, String S) {
        int counter = 0;
        
        Set<Character> jewels_set = new HashSet();
        for (char j: J.toCharArray()) 
            jewels_set.add(j);
        
        for (char stone: S.toCharArray())
            if (jewels_set.contains(stone)) 
                counter++;
            
        return counter;
    }
}

