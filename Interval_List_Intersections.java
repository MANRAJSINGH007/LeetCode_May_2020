class Solution {
    public int[][] intervalIntersection(int[][] arr, int[][] brr) {
        ArrayList<int[]> list = new ArrayList<>();
        int n = arr.length, m = brr.length;
        int i = 0, j = 0;
        while(i < n && j < m) {
            int[] obj1 = arr[i];
            int[] obj2 = brr[j];
            if(obj1[1] < obj2[0] || obj2[1] < obj1[0]) {
                if(obj1[1] < obj2[0]) i++;
                else j++;
            }
            else {
                int s = Math.max(obj1[0], obj2[0]);
                int e = Math.min(obj1[1], obj2[1]);
                int[] ans = {s, e};
                list.add(ans);
                if(obj1[0] == obj2[0]) {
                    if(obj1[1] < obj2[1]) i++;
                    else j++;
                }
                else if(s == obj2[0]) {
                    if(obj1[1] <= obj2[1]) i++;
                    else j++;
                }
                else {
                    if(obj2[1] <= obj1[1]) j++;
                    else i++;
                }
            }
        }
        int p = list.size();
        int[][] answer = new int[p][2];
        for(int t = 0; t < p; t++) answer[t] = list.get(t);
        return answer;
    }
}
