import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wantedFibonacci=Integer.parseInt(scanner.nextLine());
        if(wantedFibonacci==1){
            System.out.println("1");
        }
        else if(wantedFibonacci==2){
            System.out.println("1");
        }
        else {
            System.out.println(getFibonaaci(wantedFibonacci));
        }
    }
    private static int getFibonaaci(int num){
        int fibonacciprev=1;
        int fibonacciprev2=1;
        int newFibonacci=0;
        for(int i=3;i<=num;i++){
            newFibonacci=fibonacciprev+fibonacciprev2;
            fibonacciprev2=fibonacciprev;
            fibonacciprev=newFibonacci;
        }
        return newFibonacci;
    }
}
