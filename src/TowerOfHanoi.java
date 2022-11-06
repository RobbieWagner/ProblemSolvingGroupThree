import java.util.*;

public class TowerOfHanoi {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int rings = scanner.nextInt();
        scanner.close();

        // this is important to know where to start
        boolean right = false;
        if (rings % 2 == 0) {right = true;}

        final int moves = calculateMoves(rings);
        System.out.println(moves);

        Stack[] stacks = {new Stack<Integer>(), new Stack<Integer>(), new Stack<Integer>()};

        for(int i = rings; i > 0; i--) stacks[0].push(i);

        int currentMove = 1;
        while(currentMove <= moves)
        {
            printNextHanoiMove(currentMove, rings, right, stacks);
            currentMove++;
        }
    }

    private static int calculateMoves(int rings) {
        return (int) Math.round(Math.pow(2, rings) - 1);
    }

    private static void printNextHanoiMove(int currentMove, int rings, boolean right, Stack<Integer>[] stacks) {
        if(currentMove % 2 == 1) {
            moveFirstRing(right, stacks);
        }
        else {
            makeValidMove(stacks);
        }
    }

    private static void moveFirstRing(boolean moveRight, Stack<Integer>[] stacks) {
        int stackFrom;
        int stackTo;

        for(int i = 0; i < stacks.length; i++) {
            try {
                if (stacks[i].peek() == 1) {
                    int ringToMove = stacks[i].pop();

                    if (moveRight && i != 2) {
                        stackFrom = i;
                        stackTo = i + 1;
                        stacks[i + 1].push(ringToMove);
                    } else if (moveRight) {
                        stacks[0].push((ringToMove));
                        stackFrom = i;
                        stackTo = 0;
                    } else if (!moveRight && i != 0) {
                        stackFrom = i;
                        stackTo = i - 1;
                        stacks[i - 1].push(ringToMove);
                    } else {
                        stackFrom = i;
                        stackTo = 2;
                        stacks[2].push(ringToMove);
                    }
                    System.out.println((stackFrom + 1) + " " + (stackTo + 1));
                    return;
                }
            } catch (EmptyStackException e) {
            }
        }
    }

    private static void makeValidMove(Stack<Integer>[] stacks) {
        int stackFrom = 3;
        int stackTo = 3;
        int smallestRing = 17;

        for(int i = 0; i < stacks.length; i++) {
            try {
                int currentRing = stacks[i].peek();
                if (currentRing != 1 && currentRing < smallestRing) {
                    smallestRing = currentRing;
                    if(stackFrom < 3) stackTo = stackFrom;
                    stackFrom = i;
                } else if (stacks[i].peek() != 1) stackTo = i;
            }
            catch(EmptyStackException e) {
                if(stackTo == 3) stackTo = i;
            }
        }

        int ring = stacks[stackFrom].pop();
        stacks[stackTo].push(ring);

        System.out.println((stackFrom + 1) + " " + (stackTo + 1));
    }
}
