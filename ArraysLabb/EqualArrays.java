import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();
        String[] firstArr = firstLine.split("\\s+");
        String[] secondArr = secondLine.split("\\s+");
        int[] firstArrAsNums = new int[firstArr.length];
        int[] secondArrAsNums = new int[secondArr.length];
        boolean check=false;
        int sum=0;
        for(int i=0;i<firstArr.length;i++){
            firstArrAsNums[i]=Integer.parseInt(firstArr[i]);
            secondArrAsNums[i]=Integer.parseInt(secondArr[i]);
           if(firstArrAsNums[i]==secondArrAsNums[i]){
               sum+=firstArrAsNums[i];

           }
           else{
               System.out.printf("Arrays are not identical. Found difference at %d index.",i);
               check=true;
               break;
           }
        }
        if(!check){
            System.out.printf("Arrays are identical. Sum: %d",sum);
        }
    }
}
/* different way
 String firstArrayAsLine = scanner.nextLine();
        String[] firstArrSplit = firstArrayAsLine.split(" ");
        int[] firstArrNum = new int[firstArrSplit.length];
        String secondArrayAsLine = scanner.nextLine();
        String[] secondArrSplit = secondArrayAsLine.split(" ");
        int[] secondArrNum = new int[firstArrSplit.length];
        boolean check = true;
        int sum = 0;
        if (firstArrSplit.length == secondArrSplit.length) {
            for (int i = 0; i < firstArrSplit.length; i++) {
                firstArrNum[i] = Integer.parseInt(firstArrSplit[i]);
                secondArrNum[i] = Integer.parseInt(secondArrSplit[i]);
                if (firstArrNum[i] == secondArrNum[i]) {
                    sum += firstArrNum[i];
                    continue;
                } else if (firstArrNum[i] != secondArrNum[i]) {
                    System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.printf("Arrays are identical. Sum: %d", sum);
            }
        }
 */