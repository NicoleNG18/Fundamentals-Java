import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();
        String [] arrayAsStrings=input.split(" ");
        int [] arrayAsInteger = new int[arrayAsStrings.length];
        int sum=0;
        for (int i=0;i<arrayAsStrings.length;i++){
           arrayAsInteger[i]=Integer.parseInt(arrayAsStrings[i]);
            if(arrayAsInteger[i]%2==0){
            sum+=arrayAsInteger[i];
            }
        }
        System.out.println(sum);
    }
}
