class Solution {
    public int firstUniqChar(String s) {
        int ans = -1;
        int n = s.length();
        HashMap<Character, Boolean> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            if(map.containsKey(s.charAt(i))) map.put(s.charAt(i), false);
            else map.put(s.charAt(i), true);
        }
        for(int i = 0; i < n; i++) if(map.get(s.charAt(i))) return i;
        return -1;
    }
}
