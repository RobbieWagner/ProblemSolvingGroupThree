public class Grid {

    public int m;
    public int n;

    public int startX;
    public int startY;

    public int endX;
    public int endY;

    public Grid(int mIn, int nIn, int startXIn, int startYIn, int endXIn, int endYIn) {
        m = mIn;
        n = nIn;
        startX = startXIn;
        startY = startYIn;
        endX = endXIn;
        endY = endYIn;
    }

    public String toString(){
        return "m: " + m + "\nn: " + n + "\nStartPos: " + startX + " " + startY + "\nEndPos: " + endX + " " + endY;
    }

    public boolean canBeTraversed(){
        int[][] matrix = new int[m][n];
        initializeMatrix(matrix, m, n);

        return false;
    }

    private void initializeMatrix(int[][] matrix, int x, int y) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matrix[i][j] = 0;
            }
        }
    }

}
