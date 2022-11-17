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
        return true;
    }
}
