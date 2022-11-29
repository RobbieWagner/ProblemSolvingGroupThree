import java.util.Scanner;

public class GridPathCon {
    public static void main(String[] args) {
        // This is our running function
        final Scanner scan = new Scanner(System.in);

        final int testCases = scan.nextInt();

        for (int i = 0; i < testCases; i++) {
            int m, n, y1, x1, y2, x2;

            m = scan.nextInt();
            n = scan.nextInt();
            y1 = scan.nextInt();
            x1 = scan.nextInt();
            y2 = scan.nextInt();
            x2 = scan.nextInt();

            System.out.println(solveGridPathCon(m, n, y1, x1, y2, x2));

        }
    }

    private static String solveGridPathCon(int m, int n, int y1, int x1, int y2, int x2) {
        boolean matrix[][] = new boolean[m][n];
        int start[] = {x1, y1};
        int end[] = {x2, y2};
        return "NO";
    }
}
