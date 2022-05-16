import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();
        String [] array=input.split("\\s+");
        int sumEven=0;
        int sumOdd=0;
        for (String numberAsString:array) {
            int number=Integer.parseInt(numberAsString);
            if(number%2==0){
                sumEven+=number;
            }
            else sumOdd+=number;
        }
        System.out.println(sumEven-sumOdd);
    }
}
