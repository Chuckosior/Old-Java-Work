import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;


public class FlashingSquare extends Square {


	public FlashingSquare(int x, int y, int size) {
		super(x, y, size);
		Square squ = new Square(x, y, size);
		squ.mousePressed(null);
		Timer timer = new Timer(500,null);
		timer.start();
	}
}

