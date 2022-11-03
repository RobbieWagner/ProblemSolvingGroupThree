import java.util.*;

public class TowerOfHanoi {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int rings = scanner.nextInt();
        scanner.close();

        // this is important to know where to start
        if (rings % 2 == 0) {
            final boolean isEven = true;
        }
        else {final boolean isEven = false;}

        final int moves = calculateMoves(rings);
        System.out.println(moves);

        Stack stack1 = new Stack<Integer>(), stack2 = new Stack<Integer>(), stack3 = new Stack<Integer>();

        for(int i = rings; i > 0; i--) stack1.push(i);

        int currentMove = 1;
        while(currentMove <= moves)
        {
            printNextHanoiMove(currentMove, rings);
            currentMove++;
        }
    }

    private static int calculateMoves(int rings) {
        return (int) Math.round(Math.pow(2, rings) - 1);
    }

    private static void printNextHanoiMove(int currentMove, int rings) {
        if(currentMove % 2 == 1) {
            if(rings % 2 == 0) moveFirstRing(true);
            else moveFirstRing(false);
        }
        else {
            makeValidMove();
        }
    }

    private static void moveFirstRing(boolean moveRight) {

    }

    private static void makeValidMove() {

    }
}
