package recognition;

import java.util.Scanner;

public class Grid {

    private final int rows;
    private final int columns;
    private final boolean[] array;

    public Grid(int rows, int columns, boolean[] array) {
        this.rows = rows;
        this.columns = columns;
        this.array = array.clone();
    }

    public boolean[] get() {
        return array;
    }

    public static Grid read(char[][] chars) {
        int rows = chars.length;
        int columns = chars[0].length;
        boolean[] array = new boolean[rows * columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i * rows + j] = (chars[i][j] == 'X');
            }
        }
        return new Grid(rows, columns, array.clone());
    }

    public static Grid read(int rows, int columns) {
        final Scanner scanner = new Scanner(System.in);
        boolean[] array = new boolean[rows * columns];
        for (int i = 0; i < array.length; i += rows) {
            String row = scanner.next();
            for (int j = 0; j < columns; j++) {
                array[i + j] = (row.charAt(j) == 'X');
            }
        }
        return new Grid(rows, columns, array.clone());
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++)
                System.out.print(array[rows * i + j] ? 'X' : '_');
            System.out.println();
        }
    }
}