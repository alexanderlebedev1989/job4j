package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixCheckTest {

    @Test
    public void whenHasMonoHorizontal() {
        char[][] board = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheck.monoHorizontal(board, 1);
        assertThat(result, is(true));
    }

    @Test
    public void whenHasMonoVertical() {
        char[][] board = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        boolean result = MatrixCheck.monoVertical(board, 2);
        assertThat(result, is(true));
    }

    @Test
    public void whenDiagonal() {
        char[][] board = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'},
        };
        char[] rsl = MatrixCheck.extractDiagonal(board);
        char[] expect = {'X', 'X', 'X'};
        assertThat(rsl, is(expect));
    }
}
