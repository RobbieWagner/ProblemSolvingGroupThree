import java.util.ArrayList;
import java.util.Scanner;

public class JosephusII {
    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);

        final int num_of_kids = scan.nextInt();
        final int skip_num = scan.nextInt();
        ArrayList<Integer> kids = new ArrayList<>();

        for (int i = 1; kids.size() < num_of_kids; i++) kids.add(i);

        doJosephus(kids, skip_num);
    }

    private static void doJosephus(ArrayList<Integer> kids, int skip_num) {
        int arr_size = kids.size();
        int i = skip_num % arr_size;
        StringBuilder string_to_print = new StringBuilder();

        while (kids.size() > 0) {

            string_to_print.append(kids.remove(i % arr_size)).append(" ");

            if (i + skip_num >= kids.size()) {
                try {
                    i = ((i % kids.size()) + skip_num) % kids.size();
                }
                catch (ArithmeticException ignore) {}
                arr_size = kids.size();
            }
            else i += skip_num;
        }
        string_to_print.deleteCharAt(string_to_print.length() - 1);
        System.out.println(string_to_print);
    }
}
