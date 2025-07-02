package recursion;

public class Patterns {
    public static void printTriangle(int row, int col) {
        if (row == 0) {
            return;
        }
        if (row == col) {
            System.out.println();
            printTriangle(row - 1, 0);
            return;
        }
        System.out.print("* ");
        printTriangle(row, col + 1);
    }

    public static void main(String[] args) {
        printTriangle(4, 0);
    }
}