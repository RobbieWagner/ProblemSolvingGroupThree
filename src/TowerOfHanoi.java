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
        //print the next hanoi move.
        //print should be the stack you are pulling the top ring from, and then the one you place down.
        //Ex. input 2, moves are:
            //move top ring from column 1 to column 2: 1 2
            //move top ring from column 1 to column 3: 1 3
            //move top ring from column 2 to column 3: 1 3
        //odd rings go 1 -> 2 -> 3, even rings go 1 -> 3 -> 2
    }
}
