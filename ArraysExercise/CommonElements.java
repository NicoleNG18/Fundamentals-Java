import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        ;
        String secondLine = scanner.nextLine();
        String[] firstArrAsStrings = firstLine.split("\\s+");
        String[] secondArrAsStrings = secondLine.split("\\s+");
        for (int i = 0; i < secondArrAsStrings.length; i++) {
            for (int j = 0; j < firstArrAsStrings.length; j++) {
                if (secondArrAsStrings[i].equals(firstArrAsStrings[j])) {
                    System.out.print(secondArrAsStrings[i] + " ");
                }
            }
        }

    }
}
