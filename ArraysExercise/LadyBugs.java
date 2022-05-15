import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfField = Integer.parseInt(scanner.nextLine());
        int[] array = new int[sizeOfField];
        String[] idexesArrayString = scanner.nextLine().split("\\s+");
        int[] indexesArrayInt = new int[idexesArrayString.length];
        for (int i = 0; i < indexesArrayInt.length; i++) {
            indexesArrayInt[i] = Integer.parseInt(idexesArrayString[i]);    //slagame 1 tam,kudeto ima ladybugs
            if (indexesArrayInt[i] >= 0 && indexesArrayInt[i] < sizeOfField-1) {
                array[indexesArrayInt[i]] = 1;
            }
        }
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] arrayCommandStrng = command.split("\\s+");
            int indexOfBug = Integer.parseInt(arrayCommandStrng[0]);
            if (indexOfBug >= 0 && indexOfBug < sizeOfField) {
                int numberOfSteps = Integer.parseInt(arrayCommandStrng[2]);
                if (arrayCommandStrng[1].equals("left")) {
                    int indexOfMesteneLeft = indexOfBug - numberOfSteps;
                    if (indexOfMesteneLeft >= 0 && indexOfMesteneLeft < sizeOfField-1) {
                        if (array[indexOfMesteneLeft] == 0) {
                            if(array[indexOfBug]==1) {
                                array[indexOfMesteneLeft] = 1;
                                array[indexOfBug] = 0;
                            }
                            else{
                                command= scanner.nextLine();
                            }
                        } else {
                            while (array[indexOfMesteneLeft] != 0) {
                                if (indexOfMesteneLeft >= 0 && indexOfMesteneLeft < sizeOfField - 1) {
                                    indexOfMesteneLeft--;
                                } else {
                                    array[indexOfBug] = 0;
                                    break;
                                }
                            }
                            array[indexOfMesteneLeft] = 1;
                        }
                    } else {
                        array[indexOfBug] = 0;
                    }

                } else if (arrayCommandStrng[1].equals("right")) {
                    int indexOfMesteneRight = indexOfBug + numberOfSteps;
                    if (indexOfMesteneRight >= 0 && indexOfMesteneRight < sizeOfField-1) {
                        if (array[indexOfMesteneRight] == 0) {
                            if(array[indexOfBug]==1) {
                                array[indexOfMesteneRight] = 1;
                                array[indexOfBug] = 0;
                            }
                           /* else{
                                command= scanner.nextLine();
                            }*/
                        } else {
                            while (array[indexOfMesteneRight] != 0) {
                                if (indexOfMesteneRight >= 0 && indexOfMesteneRight < sizeOfField - 1) {
                                    indexOfMesteneRight++;
                                } else {
                                    array[indexOfBug] = 0;
                                    break;
                                }
                            }
                            array[indexOfMesteneRight] = 1;
                            array[indexOfBug] = 0;
                        }
                    } else {
                        array[indexOfBug] = 0;
                    }
                }
                command = scanner.nextLine();
            } else {
                command = scanner.nextLine();
            }
        }
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
/*4
 2 3
 7 left 3
 2 right 6
 2 left 1
 3 right 0
 4 right -2
 3 left -2
 end*/