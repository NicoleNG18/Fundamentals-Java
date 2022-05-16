import java.util.Scanner;

public class Hlp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] array = input.split("\\s+");
        int[] arrayAsIntegers = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayAsIntegers[i] = Integer.parseInt(array[i]);
        }
        if (array.length == 1) {
            System.out.printf("%s is already condensed to number", array[0]);
        }
        else{
            int counter =array.length;
            while(counter>1){
                for (int i = 0; i < array.length-1; i++) {
                    arrayAsIntegers[i]=arrayAsIntegers[i]+arrayAsIntegers[i+1];
                }
                counter--;
            }
            System.out.println(arrayAsIntegers[0]);
        }
    }
}
