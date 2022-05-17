import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class LIS2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] legthLis = new int[numbers.length];
        int[] previousIndex=new int[numbers.length];
        Arrays.fill(legthLis, 1);
        Arrays.fill(previousIndex,-1);
        for (int currentIndex =1; currentIndex < numbers.length; currentIndex++) {
            for(int prevIndex=0;prevIndex< currentIndex;prevIndex++){
               if(numbers[prevIndex]<numbers[currentIndex]){
                   int candidateLength=legthLis[prevIndex]+1;
                   if(candidateLength> legthLis[currentIndex]){
                       legthLis[currentIndex]=candidateLength;
                       previousIndex[currentIndex]=prevIndex;
                   }
               }

            }
        }
        int maximumLength=0;
        int maxLengthIndex=0;
        for(int i=0;i< numbers.length;i++){
            if(legthLis[i]>maximumLength){
                maximumLength=legthLis[i];
                maxLengthIndex=i;
            }
        }
        List <Integer> finalLine=new ArrayList<>();
        for(int i=0;i< maximumLength;i++){
           finalLine.add(numbers[maxLengthIndex]);
           maxLengthIndex=previousIndex[maxLengthIndex];
        }
         for(int i=finalLine.size()-1;i>=0;i--){
             System.out.print(finalLine.get(i)+" ");
         }
    }
}
// maxL-6 maxLI-8
//  0 1  2  3  4  5 6 7 8  9  10 - current index
//  3 14 5  12 15 7 8 9 11 10 1
//  1 2  2  3  4  3 4 5 6  6  1
// -1 0  0  2  3  2 5 6 7  7  -1