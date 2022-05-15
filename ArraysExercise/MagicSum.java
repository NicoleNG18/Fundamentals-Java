import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayAsStrings = scanner.nextLine().split("\\s+");
        int[] arrayAsInt = new int[arrayAsStrings.length];
        for (int i = 0; i < arrayAsStrings.length; i++) {
            arrayAsInt[i] = Integer.parseInt(arrayAsStrings[i]);
        }
        int number = Integer.parseInt(scanner.nextLine());
        for (int j = 0; j < arrayAsInt.length - 1; j++) {
            if (arrayAsInt[j] + arrayAsInt[j + 1] == number) {
                System.out.println(arrayAsInt[j] + " " + arrayAsInt[j + 1]);
            }

        }
    }
}
