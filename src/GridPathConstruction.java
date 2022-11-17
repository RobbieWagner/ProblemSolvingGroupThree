import java.util.*;

public class GridPathConstruction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int testCases = scan.nextInt();
        ArrayList<Grid> grids= new ArrayList<Grid>();

        for(int i = 0; i < testCases; i++){
            int m = scan.nextInt();
            int n = scan.nextInt();
            int startX = scan.nextInt();
            int startY = scan.nextInt();
            int endX = scan.nextInt();
            int endY = scan.nextInt();

            Grid grid = new Grid(m, n, startX, startY, endX, endY);
            grids.add(grid);

            System.out.println(grid.toString());
        }

        for(Grid grid : grids) {
            System.out.println(grid.canBeTraversed());
        }
    }
}

class Grid {

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

class Node {
    public int connections;
    public boolean traversed;

    public Node(int connectionsIn) {
        connections = connectionsIn;
        traversed = false;
    }

    public String toString(){
        return "connections: " + connections + "\ntraversed? " + traversed;
    }
}