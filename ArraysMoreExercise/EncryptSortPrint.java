import java.util.Scanner;
import java.util.Arrays;

public class EncryptSortPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countNames = Integer.parseInt(scanner.nextLine());
        int[] finalArray = new int[countNames];
        for (int j = 0; j < countNames; j++) {
            int sum = 0;
            String name = scanner.nextLine();
            char[] characterArray = new char[name.length()];
            for (int i = 0; i < characterArray.length; i++) {
                characterArray[i] = name.charAt(i);
                if (characterArray[i] == 65 || characterArray[i] == 69 || characterArray[i] == 73 || characterArray[i] == 79 || characterArray[i] == 85 || characterArray[i] == 97 || characterArray[i] == 101 || characterArray[i] == 105 || characterArray[i] == 111 || characterArray[i] == 117) {
                    sum += characterArray[i] * name.length();
                } else {
                    sum += characterArray[i] / name.length();
                }
            }
            finalArray[j] = sum;
        }
        Arrays.sort(finalArray);
        for(int k=0;k<finalArray.length;k++){
            System.out.println(finalArray[k]);
        }
    }
}
