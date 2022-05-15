import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayAsStrings = scanner.nextLine().split("\\s+");
        int[] arrayAsInt = new int[arrayAsStrings.length];
        for (int i = 0; i < arrayAsStrings.length; i++) {
            arrayAsInt[i] = Integer.parseInt(arrayAsStrings[i]);
        }
        int currentCount = 1;
        int max=1;
        int numOfSequence = 0;
        for (int j = 0; j < arrayAsStrings.length - 1; j++) {
            if (arrayAsInt[j] == arrayAsInt[j + 1]) {
                currentCount++;
                if(currentCount>max){
                    max=currentCount;
                    numOfSequence = arrayAsInt[j];
                }
            } else {
                currentCount = 1;
            }
        }
            for (int i = 0; i < max; i++) {
                System.out.print(numOfSequence + " ");
            }
        }

    }

