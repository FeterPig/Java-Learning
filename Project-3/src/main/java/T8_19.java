import java.util.Scanner;

public class T8_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("输入行数: ");
        int rows = input.nextInt();
        System.out.print("输入列数: ");
        int cols = input.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("输入矩阵数字:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println(isConsecutiveFour(matrix));
    }

    public static boolean isConsecutiveFour(int[][] values) {
        int rows = values.length;
        if (rows == 0) return false;
        int cols = values[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= cols - 4; j++) {
                int val = values[i][j];
                if (val == values[i][j + 1] && val == values[i][j + 2] && val == values[i][j + 3]) {
                    return true;
                }
            }
        }

        for (int i = 0; i <= rows - 4; i++) {
            for (int j = 0; j < cols; j++) {
                int val = values[i][j];
                if (val == values[i + 1][j] && val == values[i + 2][j] && val == values[i + 3][j]) {
                    return true;
                }
            }
        }

        for (int i = 0; i <= rows - 4; i++) {
            for (int j = 0; j <= cols - 4; j++) {
                int val = values[i][j];
                if (val == values[i + 1][j + 1] && val == values[i + 2][j + 2] && val == values[i + 3][j + 3]) {
                    return true;
                }
            }
        }

        for (int i = 0; i <= rows - 4; i++) {
            for (int j = 3; j < cols; j++) {
                int val = values[i][j];
                if (val == values[i + 1][j - 1] && val == values[i + 2][j - 2] && val == values[i + 3][j - 3]) {
                    return true;
                }
            }
        }

        return false;
    }
}
