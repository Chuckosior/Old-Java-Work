import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;

//Charles helped me a bunch, so give him a pat on the back
public class MazeSolverStack {
	private int stackSize;
	private int[] stackArr;
	private int top;

	// constructor for stack with parameter size
	public MazeSolverStack(int size) {
		this.stackSize = size;
		this.stackArr = new int[stackSize];
		this.top = -1;
	}

	// push method, adds new entry to top of stack
	// if stack is full, increase stack capacity.
	public void push(int path) {
		if (this.isStackFull()) {
			System.out.println("Stack is full. We must make it bigger");
			this.increaseStackCapacity();
		}
		System.out.println(path + "added");
		this.stackArr[++top] = path;
	}

	// pop method to remove entry from top of stack
	// returns the entry popped
	public int pop() throws Exception {
		if (this.isStackEmpty()) {
			throw new Exception("Stack is empty.");
		}
		int entry = this.stackArr[top--];
		System.out.println(entry + "removed.");
		return entry;
	}

	// peek method return top of stack without popping.
	public long peek() {
		return stackArr[top];
	}

	private void increaseStackCapacity() {

		int[] newStack = new int[this.stackSize * 2];
		for (int i = 0; i < stackSize; i++) {
			newStack[i] = this.stackArr[i];
		}
		this.stackArr = newStack;
		this.stackSize = this.stackSize * 2;
	}

	public boolean isStackEmpty() {
		return (top == -1);
	}

	// returns true if stack is false
	public boolean isStackFull() {
		return (top == stackSize - 1);
	}

	public static void main(String[] args) {
		int north = 0;
		int south = 0;
		int east = 0;
		int west = 0;
		String abc = "0123456789ABCDEF";
		Scanner kbd = new Scanner(System.in);
		int rows = kbd.nextInt();
		int cols = kbd.nextInt();
		int startRow = kbd.nextInt();
		int startCol = kbd.nextInt();
		int endRow = kbd.nextInt();
		int endCol = kbd.nextInt();
		int curRow = startRow;
		int curCol = startCol;
		kbd.nextLine();
		int[][] grid = new int[rows][cols];
		boolean[][] breadcrumbs = new boolean[rows][cols];

		for (int row = 0; row < (rows); row++) {
			String line = kbd.nextLine();

			for (int col = 0; col < (cols); col++) {
				grid[row][col] = abc.indexOf(line.charAt(col));
				breadcrumbs[row][col] = false;
				// if (col == cols - 1)
				// System.out.println();
				// else
				// System.out.print(" ");

			}

		}
		Stack<ArrayList<Integer>> stack = new Stack<ArrayList<Integer>>();
		;
		ArrayList path = new ArrayList();
		path.add(curRow);
		path.add(curCol);
		stack.push(path);
		breadcrumbs[curRow][curCol] = true;
//		
		//System.out.println(stack.peek());

		ArrayList<Integer> t = null;
		while (curRow != endRow || curCol != endCol) {
			t = stack.pop();
			//System.out.println(t);
			curRow = t.get(t.size() - 2);
			curCol = t.get(t.size() - 1);
			
			breadcrumbs[curRow][curCol] = true;
			//System.out.println(curRow + " " + curCol);
			// if there is no wall north and the place hasnt been visited before
			if (((grid[curRow][curCol] & 1) == 0)
					&& !breadcrumbs[curRow - 1][curCol]) {
				//System.out.println("N");
				// then there is no wall north and you havent been there, so go
				// north
				ArrayList<Integer> p = new ArrayList<Integer>();
				p.addAll(t);
				p.add(curRow-1);
				p.add(curCol);
				stack.push(p);
			}
			// if north didnt work, try south
			if ((grid[curRow][curCol] & 2) == 0
					&& !breadcrumbs[curRow + 1][curCol]) {
				//System.out.println("S");
				ArrayList<Integer> p = new ArrayList<Integer>();
				p.addAll(t);
				p.add(curRow+1);
				p.add(curCol);
				stack.push(p);
			}
			// try east
			if ((grid[curRow][curCol] & 4) == 0
					&& !breadcrumbs[curRow][curCol + 1]) {
				//System.out.println("E");
				ArrayList<Integer> p = new ArrayList<Integer>();
				p.addAll(t);
				p.add(curRow);
				p.add(curCol+1);
				stack.push(p);
			}
			// try west
			if ((grid[curRow][curCol] & 8) == 0
					&& !breadcrumbs[curRow][curCol - 1]) {
				//System.out.println("W");
				ArrayList<Integer> p = new ArrayList<Integer>();
				p.addAll(t);
				p.add(curRow);
				p.add(curCol-1);
				stack.push(p);
			}

			// stack.peek().get(path.length());
		}
		if(t == null){
			System.out.print(startRow+"\t"+startCol);
		}
		else
		for (int i = 0; i < t.size(); i++) {
			System.out.print(t.get(i));
			if(i % 2 == 1) {
				System.out.println();
			}
			else System.out.print("\t");

			
		}
	}
}
