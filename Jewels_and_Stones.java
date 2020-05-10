class Solution {
    public int numJewelsInStones(String J, String S) {
        boolean[] present = new boolean[256];
        for(int i = 0; i < J.length(); i++) present[J.charAt(i)] = true;
        int ans = 0;
        for(int i = 0; i < S.length(); i++) if(present[S.charAt(i)]) ans++;
        return ans;
    }
}
