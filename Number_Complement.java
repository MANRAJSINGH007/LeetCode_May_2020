class Solution {
    public int findComplement(int num) {
        if(num == 0) return 1;
        String ans = "";
        while(num > 0) {
            ans = num % 2 == 0 ? '1' + ans : '0' + ans;
            num /= 2;
        }
        int x = 0;
        for(int i  = ans.length() - 1; i >= 0; i--) x += (ans.charAt(i) - '0') * (int)Math.pow(2, ans.length() - 1 - i);
        return x;
    }
}
