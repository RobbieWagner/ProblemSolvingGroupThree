import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int input = scanner.nextInt();
        scanner.close();

        print_how_many_moves(input);

        // find order of rings?
        // implement method for each ring?

    }

    private static void print_how_many_moves(int input) {
        System.out.println(Math.round(Math.pow(2, input) - 1));
    }
}
