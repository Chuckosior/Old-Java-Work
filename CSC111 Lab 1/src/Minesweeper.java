/*
 *
 *  Description: This program creates and prints a Minesweeper game board.
 *               The programmer provides the height and width of the board,
 *               as well as the number of mines. The program is written in
 *               java using a monolithic style
 *
 *   To Compile: javac Minesweeper.java
 *       To Run: java Minesweeper
 *
 */

import java.util.Scanner;

// All java code must be defined in a class
public class Minesweeper {

  // Simple java programs do not use OOP features
  // These programs can be found entirely in the main method
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
	
    // 3 variables (width, height, number of mines)
    System.out.print("Enter the width of the minefield: ");
    int width = in.nextInt();
    System.out.print("Enter the height of the minefield: ");
    int height = in.nextInt();
    System.out.print("Enter the number of mines in the minefield: ");
    int num = in.nextInt();

    // Create the minefield as a 2D array of chars
    //     (Created with a buffer around the edges to simply calculations)
    char[][] minefield = new char[height+2][width+2];

    // Populate the minefield using nested for loops
	//     (You can also use while loops just like in scala)
    for (int i = 0; i < num; i++) {
      // Create variables for randomely generated rows and columns in outer scope
      int row = 0;
      int col = 0;
      // do/while to generate random locations for mines until a novel one is found
      do {
        // Generate the random positions inside the buffer
        row = (int)(Math.random() * height + 1);
        col = (int)(Math.random() * width + 1);
      } while (minefield[row][col] == '*');
      minefield[row][col] = '*'; // Set found location to the mine character
    }

    // Start row/col at 1 because of buffer
    for (int row = 1; row < height+1; row++)
      for (int col = 1; col < width+1; col++) {
        if (minefield[row][col] != '*') {
          // Check the surrounding positions and count the number of mines there
          int n = 0;
          for (int r = -1; r <= 1; r++)
            for (int c = -1; c <= 1; c++) {
              if (minefield[row+r][col+c] == '*')
				n += 1;
            }
          // Stick a number in to the field
          minefield[row][col] = (char)('0' + n);
        }
        // Print the minefield as it is created
        System.out.print(minefield[row][col]);
		char endChar = (col == width) ? '\n' : ' ';
        System.out.print(endChar);
      }
  }
}
