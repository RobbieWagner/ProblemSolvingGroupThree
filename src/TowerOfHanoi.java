import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int input = scanner.nextInt();
        scanner.close();

        final int moves = calculatemoves(input);
        int currentMove = 1;

        System.out.println(moves);

        while(currentMove <= moves)
        {
            printNextHanoiMove(currentMove);
            currentMove++;
        }
    }

    private static int calculatemoves(int input) {
        return (int) Math.round(Math.pow(2, input) - 1);
    }

    private static void printNextHanoiMove(int currentMove) {

    }
}
