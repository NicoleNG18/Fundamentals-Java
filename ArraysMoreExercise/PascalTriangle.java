import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[input][input];
        //slagame edinicite na mestata im
        for (int row = 0; row < matrix.length; row++) {
            int currentRow = row + 1;
            for (int coloumn = 0; coloumn < matrix.length; coloumn++) {
                int currentColoumn = coloumn + 1;
                if (currentColoumn == 1) {
                    matrix[row][coloumn] = 1;
                }
                if (currentRow == currentColoumn) {
                    matrix[row][coloumn] = 1;
                }
            }
        }
        //populvame i drugite elementi
        for (int newRow = 2; newRow < matrix.length; newRow++) {
            for (int newCol = 1; newCol < newRow; newCol++) {
                matrix[newRow][newCol] = matrix[newRow - 1][newCol - 1] + matrix[newRow - 1][newCol];

            }
        }
        //pechatane na conzolata
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[i][j]!=0){
                    System.out.print(matrix[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
