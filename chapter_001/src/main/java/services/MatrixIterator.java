package services;

import java.util.Iterator;

public class MatrixIterator implements Iterator<Integer> {
    private final int[][] values;
    private int row;
    private int column;

    public MatrixIterator(final int[][] values) {
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return row < values.length;
    }

    @Override
    public Integer next() {
        var el = values[row][column];
        column++;
        while (row < values.length && column >= values[row].length) {
            column = 0;
            row++;
        }
        return el;
    }
}
