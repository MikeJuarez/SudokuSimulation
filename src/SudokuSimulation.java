/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author christy
 */
public class SudokuSimulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Sudoku mySudokuPuzzle = new Sudoku();
        // Row and column Latin but with invalid subsquares
        String config1 = "1234567892345678913456789124567891235678912346"
                + "78912345789123456891234567912345678";
        String[][] puzzle1 = mySudokuPuzzle.makeSudoku(config1);
        if (mySudokuPuzzle.isValidSudoku(puzzle1)) {
            System.out.println("This puzzle is valid.");
        } else {
            System.out.println("This puzzle is invalid.");
        }
        System.out.println(mySudokuPuzzle.getPrintableSudoku(puzzle1));
        System.out.println("--------------------------------------------------");

        // Row Latin but column not Latin and with invalid subsquares
        String config2 = "12345678912345678912345678912345678912345678"
                + "9123456789123456789123456789123456789";
        String[][] puzzle2 = mySudokuPuzzle.makeSudoku(config2);
        if (mySudokuPuzzle.isValidSudoku(puzzle2)) {
            System.out.println("This puzzle is valid.");
        } else {
            System.out.println("This puzzle is invalid.");
        }
        System.out.println(mySudokuPuzzle.getPrintableSudoku(puzzle1));
        System.out.println("--------------------------------------------------");

        // A valid sudoku
        String config3 = "25813764914698532779324685147286319558149273663"
                + "9571482315728964824619573967354218";
        String[][] puzzle3 = mySudokuPuzzle.makeSudoku(config2);
        if (mySudokuPuzzle.isValidSudoku(puzzle2)) {
            System.out.println("This puzzle is valid.");
        } else {
            System.out.println("This puzzle is invalid.");
        }
        System.out.println(mySudokuPuzzle.getPrintableSudoku(puzzle1));
        System.out.println("--------------------------------------------------");
    }

}
