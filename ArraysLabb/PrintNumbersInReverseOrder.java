import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfNums = Integer.parseInt(scanner.nextLine());
        int[] array = new int[countOfNums];
        for (int i = 0; i < countOfNums; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = countOfNums - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");

        }
    }
}
