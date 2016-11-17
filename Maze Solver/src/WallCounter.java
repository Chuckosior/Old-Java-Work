import java.util.Scanner;

/*EXTRA CREDIT: The wall counter will always have equal east and west walls and north/south walls
 * because whenever a wall is opened, say north, a wall must be opened in the adjacent room for the door to exist. 
 * for every north wall made, there must be a south wall made in the room to the north of the first room, same goes 
 * for east/west.
 * the east wall opens up in one room, so that means that the east room must have a west wall pointing back at the first room.
 * also, since the maze is in a closed space, there cannot be a oint where there is a wall being taken out that is on the edge
 * of a maze.*/
public class WallCounter {

	public static void main(String[] args) {
		System.out.println("MAZE:");
		String abc = "0123456789ABCDEF";
		int north = 0;
		int south = 0;
		int east = 0;
		int west = 0;
		Scanner kbd = new Scanner(System.in);
		int rows = kbd.nextInt();
		int cols = kbd.nextInt();
		kbd.nextLine();
		
		for (int row = 0; row < rows; row++) {
			String line = kbd.nextLine();
			
			for (int col = 0; col < (cols); col++) {
				int v = abc.indexOf(line.charAt(col));
				System.out.print(v);
				if(col == cols -1)
					System.out.println();
				else 
					System.out.print(" ");
				if ((v & 1) != 0)
					north++;
				if ((v & 2) != 0)
					south++;
				if ((v & 4) != 0)
					east++;
				if ((v & 8) != 0)
					west++;

			}
			/* System.out.println(); */
		}
		System.out.println("NORTH: " + north);
		System.out.println("SOUTH: " + south);
		System.out.println("EAST: " + east);
		System.out.println("WEST: " + west);

	}
}
