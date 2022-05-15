import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayAsString = scanner.nextLine().split("\\s+");
        int[] arrayAsInt = new int[arrayAsString.length];
        for (int i = 0; i < arrayAsString.length; i++) {
            arrayAsInt[i] = Integer.parseInt(arrayAsString[i]);
        }
        for (int j = 0; j < arrayAsInt.length; j++) {
            boolean isItBigger=true;
            for (int k = j + 1; k < arrayAsInt.length; k++) {
                if (arrayAsInt[j] <= arrayAsInt[k]) {
                    isItBigger=false;
                }
            }
            if (isItBigger) {
                System.out.print(arrayAsInt[j] + " ");
            }
        }

    }
}
/*  String[] arrayAsString = scanner.nextLine().split("\\s+");
        int[] arrayAsInt = new int[arrayAsString.length];
        for (int i = 0; i < arrayAsString.length; i++) {
            arrayAsInt[i] = Integer.parseInt(arrayAsString[i]);
        }
        for (int j = 0; j < arrayAsInt.length; j++) {
            int count = 0;
            for (int k = j + 1; k < arrayAsInt.length; k++) {
                if (arrayAsInt[j] <= arrayAsInt[k]) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.print(arrayAsInt[j] + " ");
            }
        }*/