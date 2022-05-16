import java.util.Scanner;

public class ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] array = input.split(" ");
        String help = "";
        for (int i = 0; i < array.length / 2; i++) {
            help = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = help;
        }
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
    }
}
/*  second easier way
String line = scanner.nextLine();
        String[] array = line.split(" ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }*/