/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mtsguest
 */
public class Sudoku {

    public String[][] makeSudoku(String s) {
        int SIZE = 9;
        int k = 0;
        String[][] x = new String[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                x[i][j] = s.substring(k, k + 1);
                k++;
            }
        }
        return x;
    }

    public String getPrintableSudoku(String[][] x) {
        int SIZE = 9;
        String temp = "";
        for (int i = 0; i < SIZE; i++) {
            if ((i == 3) || (i == 6)) {
                temp = temp + "=================\n";
            }
            for (int j = 0; j < SIZE; j++) {
                if ((j == 3) || (j == 6)) {
                    temp = temp + " || ";
                }
                temp = temp + x[i][j];
            }
            temp = temp + "\n";
        }
        return temp;
    }

    public boolean isValidSudoku(String[][] x) {
        return rowsAreLatin(x) && colsAreLatin(x) && goodSubsquares(x);
    }

    public boolean rowsAreLatin(String[][] x) {
        boolean test = true;
        for (int i = 0; i < x.length; i++) {
            test = test && rowIsLatin(x,i);
        }
        return test;
    }

    public boolean rowIsLatin(String[][] x, int i) {
        // fill in your code here
        return true;
    }

    public boolean colsAreLatin(String[][] x) {
        // fill in your code here
        return true;
    }

    public boolean colIsLatin(String[][] x, int j) {
        // fill in your code here
        return true;
    }

    public boolean goodSubsquares(String[][] x) {
        // fill in your code here
        return true;
    }

    public boolean goodSubsquare(String[][] x, int i, int j) {
        // fill in your code here
        return true;
    }

}
