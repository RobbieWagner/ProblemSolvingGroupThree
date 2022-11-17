import java.util.*;

public class GridPathConstruction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int testCases = scan.nextInt();
        ArrayList<Grid> Grids= new ArrayList<Grid>();

        for(int i = 0; i < testCases; i++){
            int m = scan.nextInt();
            int n = scan.nextInt();
            int startX = scan.nextInt();
            int startY = scan.nextInt();
            int endX = scan.nextInt();
            int endY = scan.nextInt();

            Grid grid = new Grid(m, n, startX, startY, endX, endY);
            Grids.add(grid);

            System.out.println(grid.toString());
        }
    }
}
