package arrays;

import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;


public class LargestAreaInMatrix {

    public static void main(String[] args) {
        InputReader reader = new InputReader();

        int n = reader.readInt();
        int m = reader.readInt();

        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = reader.readInt();
            }
        }
        boolean[][] visited = new boolean[n][m];

        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (visited[i][j]) {
                    continue;
                }
                int counter = getArea(i, j, matrix, visited);
                max = Math.max(counter, max);
            }
        }

        System.out.println(max);
    }

    static boolean inRange(int value, int max) {

        return 0 <= value && value < max;

    }

    static int getArea(int row, int col, int[][] matrix, boolean[][] visited) {

        visited[row][col] = true;

        int counter = 1;
        int rows = matrix.length;
        int cols = matrix[row].length;

        int[] dRows = {0, 1, 0, -1, -1, 1, -1, 1};  // + DIAGONALS
        int[] dCols = {1, 0, -1, 0, 1, -1, -1, 1};  // Sequence in Matrix

        for (int index = 0; index < dRows.length; index++) {

            int nextRow = row + dRows[index];
            int nextCol = col + dCols[index];

            if (!inRange(nextRow, rows) || !inRange(nextCol, cols)) {
                continue;
            }
            if (visited[nextRow][nextCol]) {
                continue;
            }

            if (matrix[row][col] == (matrix[nextRow][nextCol])) {

                counter += getArea(nextRow, nextCol, matrix, visited);
            }
        }
        return counter;
    }

}

class InputReader {

    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;

    InputReader() {
        this.stream = System.in;
    }

    int read() {
        if (numChars == -1)
            throw new InputMismatchException();
        if (curChar >= numChars) {
            curChar = 0;
            try {
                numChars = stream.read(buf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (numChars <= 0)
                return -1;
        }
        return buf[curChar++];
    }

    int readInt() {
        int c = read();
        while (isSpaceChar(c)) {
            c = read();
        }
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        int res = 0;
        do {
            if (c < '0' || c > '9') {
                throw new InputMismatchException();
            }
            res *= 10;
            res += c - '0';
            c = read();
        } while (!isSpaceChar(c));
        return res * sgn;
    }

    long readLong() {
        int c = read();
        while (isSpaceChar(c)) {
            c = read();
        }
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        long res = 0;
        do {
            if (c < '0' || c > '9') {
                throw new InputMismatchException();
            }
            res *= 10;
            res += c - '0';
            c = read();
        } while (!isSpaceChar(c));
        return res * sgn;
    }

    double readDouble() {
        int c = read();
        while (isSpaceChar(c)) {
            c = read();
        }
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        double res = 0;
        while (!isSpaceChar(c) && c != '.' && c != ',') {
            if (c == 'e' || c == 'E') {
                return res * Math.pow(10, readInt());
            }
            if (c < '0' || c > '9') {
                throw new InputMismatchException();
            }
            res *= 10;
            res += c - '0';
            c = read();
        }
        if (c == '.' || c == ',') {
            c = read();
            double m = 1;
            while (!isSpaceChar(c)) {
                if (c == 'e' || c == 'E') {
                    return res * Math.pow(10, readInt());
                }
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                m /= 10;
                res += (c - '0') * m;
                c = read();
            }
        }
        return res * sgn;
    }

    String readLine() {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do {
            res.appendCodePoint(c);
            c = read();
        } while (!isSpaceChar(c));
        return res.toString();
    }

    boolean isSpaceChar(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }
}





