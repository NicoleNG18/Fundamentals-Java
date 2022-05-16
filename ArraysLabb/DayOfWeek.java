import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number=Integer.parseInt(scanner.nextLine());
        String [] daysOfTheWeek=new String[] {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        if(number>=1 && number<=7){
            System.out.println(daysOfTheWeek[number-1]);
        }
        else{
            System.out.println("Invalid day!");
        }
    }
}
