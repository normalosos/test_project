import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String J = scanner.nextLine();
        String S = scanner.nextLine();

        int count = 0;



        for (int i = 0; i < S.length(); i++) {
            for (int j = 0; j < J.length(); j++) {
                if (S.charAt(i) == J.charAt(j)) {
                    count++;
                }
            }
        }

        System.out.println(count);

    }

}