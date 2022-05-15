import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] arrayAsString=scanner.nextLine().split("\\s+");
        int [] arrayAsInt=new int[arrayAsString.length];
        for (int i = 0; i < arrayAsString.length; i++) {
            arrayAsInt[i]=Integer.parseInt(arrayAsString[i]);
        }
        boolean check=false;
        for(int j=0;j< arrayAsString.length;j++){
            int leftSum=0;
            int rightSum=0;
            for(int left=j;left>=0;left--){
                leftSum+=arrayAsInt[left];
            }
            for(int right=j;right< arrayAsString.length;right++){
                rightSum+=arrayAsInt[right];
            }
            if(leftSum==rightSum){
                System.out.println(j);
                check=true;
                break;
            }
        }
        if(!check){
            System.out.println("no");
        }
    }
}
