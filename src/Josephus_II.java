import java.util.*;

public class Josephus_II {
    /*Consider a game where there are n children (numbered 1,2,…,n) in a circle. During the game,
     repeatedly k children are skipped and one child is removed from the circle.
      In which order will the children be removed?
    Input
    The only input line has two integers n and k.
    Output
    Print n integers: the removal order.
    Example
    Input:
    7 2
    Output:
    3 6 2 7 5 1 4*/
    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);

        System.out.println(1000000000 % 7);

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

            System.out.print(kids.remove(i % arr_size) + " ");

            if (i + skip_num >= kids.size()) {

                try {
                    i = i % kids.size();
                    i = (i + skip_num) % kids.size();
                }
                catch (ArithmeticException ignore) {}
                arr_size = kids.size();
            }
            i += skip_num;

        }
    }

}
