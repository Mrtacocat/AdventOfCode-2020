import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Day1_2020 {

    public static void main(String[] args) throws Exception {

        int sum = 0;
        File file = new File("src\\input_Day1");
        Scanner sc = new Scanner(file);

        ArrayList<Integer> list = new ArrayList<>();

        while (sc.hasNextInt()) {

            list.add(sc.nextInt());

            for (int x = 0; x < list.size(); x++) {
                for (int y = 0; y < list.size(); y++) {
                    if (list.get(x) + list.get(y) == 2020) {
                        sum = list.get(x) * list.get(y);
                    }
                }
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
