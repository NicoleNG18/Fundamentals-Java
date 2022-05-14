import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String newString = "";
        for (int i = input.length() - 1; i >= 0; i--) {
              newString += input.charAt(i);

        }
        System.out.println(newString);
    }
}
