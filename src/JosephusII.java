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
        int i = skip_num;
        int arr_size = kids.size();

        while (kids.size() > 0) {

            if(kids.size() > 1)System.out.print(kids.remove(i % arr_size) + " ");
            else System.out.print(kids.remove(i % arr_size));

            if (i + skip_num > kids.size()) {
                try {
                    i = (i + skip_num) % kids.size();
                }
                catch (ArithmeticException ignore) {}
                arr_size = kids.size();
            }
            i += skip_num;

        }
    }
}
