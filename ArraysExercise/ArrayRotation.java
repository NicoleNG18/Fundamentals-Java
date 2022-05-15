import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayAsString = scanner.nextLine().split("\\s+");
        int rotations = Integer.parseInt(scanner.nextLine());
        for (int j = 0; j < rotations; j++) {
            String help = arrayAsString[0];
            for (int k = 0; k < arrayAsString.length - 1; k++) {
                arrayAsString[k] = arrayAsString[k + 1];
            }
            arrayAsString[arrayAsString.length - 1] = help;
        }
        for (int i = 0; i < arrayAsString.length; i++) {
            System.out.print(arrayAsString[i] + " ");
        }
    }
}
/*
 String[] arrayAsString = scanner.nextLine().split("\\s+");
        int rotations = Integer.parseInt(scanner.nextLine());
        int[] arrayAsInt = new int[arrayAsString.length];
        for (int i = 0; i < arrayAsInt.length; i++) {
            arrayAsInt[i] = Integer.parseInt(arrayAsString[i]);
        }
        for (int j = 0; j < rotations; j++) {
            int help = arrayAsInt[0];
            for (int k = 0; k < arrayAsInt.length - 1; k++) {
                arrayAsInt[k] = arrayAsInt[k + 1];
            }
            arrayAsInt[arrayAsInt.length - 1] = help;
        }
        for (int i = 0; i < arrayAsInt.length; i++) {
            System.out.print(arrayAsInt[i] + " ");
        }

*/