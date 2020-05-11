class Solution {
    public int findJudge(int N, int[][] trust) {
        int m = trust.length;
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        for(int i = 1; i <= N; i++) map.put(i, new HashSet<>());
        Stack<Integer> stack = new Stack<>();
        for(int i = 1; i <= N; i++) stack.push(i);
        for(int i = 0; i < m; i++) map.get(trust[i][0]).add(trust[i][1]);
        while(stack.size() > 1) {
            int a = stack.pop();
            int b = stack.pop();
            HashSet<Integer> s1 = map.get(a);
            HashSet<Integer> s2 = map.get(b);
            if(!s1.contains(b) && !s2.contains(a)) continue;
            if(s1.contains(b)) stack.push(b);
            else if(s2.contains(a)) stack.push(a);
        }
        return (stack.size() == 0 || map.get(stack.peek()).size() > 0) ? -1 : stack.peek();
    }
}
