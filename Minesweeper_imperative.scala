/*
 *
 *  Description: This program creates and prints a Minesweeper game board.
 *               The user is prompted for the height and width of the board,
 *               as well as the number of mines. The program is written in a
 *               more imperative programming style in scala.
 *
 *   To Compile: N/A
 *       To Run: scala Minesweeper_imperative.scala
 *
 */

// The import is necessary because readInt (and the other read functions) have been
// moved to the scala.io.StdIn library in scala 2.11 (and this code was developed using
// scala 2.11). If you run this code with an earlier version of scala you should comment
// out this line.
import scala.io.StdIn._

// Three type aliases to clean up the code.

// A Row is an Array of Char
type Row = Array[Char]
// A Minefield is an Array of Rows
type Field = Array[Row]
// A Position is a Tuple2 containing a row and column (e.g (2,3))
type Position = Tuple2[Int,Int]

// Prompt the user for the 3 inputs (width, height, number of mines)
print("Enter the width of the minefield: ")
val width: Int = readInt
print("Enter the height of the minefield: ")
val height: Int = readInt
print("Enter the number of mines in the minefield: ")
val num: Int = readInt

// Create the minefield using the ofDim of the Array class
// Note that the minefield is created with a buffer around the edges to simply calculations
val minefield: Field = Array.ofDim[Char](height+2,width+2)

// Populate the minefield using nested loops
var i = 0                    // Loop counter for number of mines placed in the field
while (i < num) {
  // Create variables for randomely generated rows and columns in outer scope
  var row: Int = 0
  var col: Int = 0
  // do/while to generate random locations for mines until a novel one is found
  do {
    // Generate the random positions inside the buffer
    row = (math.random * height + 1).toInt
    col = (math.random * width + 1).toInt
  } while (minefield(row)(col) == '*')
  minefield(row)(col) = '*' // Set found location to the mine character
  i += 1                    // Increment mine counter
}

// Start row/col at 1 because of buffer
var row: Int = 1
while (row < height+1) {
  var col: Int = 1
  while (col < width+1) {
    if (minefield(row)(col) != '*') {
      // Check the surrounding positions and count the number of mines there
      var n: Int = 0
      var r: Int = -1
      while (r <= 1) {
        var c: Int = -1
        while (c <= 1) {
          n += (if (minefield(row+r)(col+c) == '*') 1 else 0)
          c += 1
        }
        r += 1
      }
      // Stick a number in to the field
      minefield(row)(col) = ('0' + n).toChar
    }
    // Print the minefield as it is created
    print(minefield(row)(col))
    print(if (col == width) '\n' else ' ')
    col += 1
  }
  row += 1
}

