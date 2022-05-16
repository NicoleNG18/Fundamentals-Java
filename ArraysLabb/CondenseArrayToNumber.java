import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] array = input.split("\\s+");
            int[] arrayAsIntegers = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                arrayAsIntegers[i] = Integer.parseInt(array[i]);
            }
        if (array.length == 1) {
            System.out.print(array[0]);
        }
        else{
            while (arrayAsIntegers.length>1) {
                int condensed[]=new int[arrayAsIntegers.length-1];
                for (int j = 0; j < arrayAsIntegers.length-1 ; j++) {
                    condensed[j]=arrayAsIntegers[j] + arrayAsIntegers[j + 1];
                }
                arrayAsIntegers=condensed;
            }
            System.out.println(arrayAsIntegers[0]);
        }
    }
}










