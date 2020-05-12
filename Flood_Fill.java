class Solution {
    public static void dfs(int[][] image, boolean[][] visited, int n, int m, int i, int j, int newColor, int oldColor) {
        if(i < 0 || j < 0 || i == n || j == m || visited[i][j] || image[i][j] != oldColor) return;
        visited[i][j] = true;
        image[i][j] = newColor;
        dfs(image, visited, n, m, i + 1, j, newColor, oldColor);
        dfs(image, visited, n, m, i - 1, j, newColor, oldColor);
        dfs(image, visited, n, m, i, j + 1, newColor, oldColor);
        dfs(image, visited, n, m, i, j - 1, newColor, oldColor);
        return;
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int n = image.length, m = image[0].length;
        dfs(image, new boolean[n][m], n, m, sr, sc, newColor, image[sr][sc]);
        return image;
    }
}
