import javax.swing.SwingUtilities;
public class Main
{
	public static void main(String[] args)
	{
		// Swing graphics should be done in a concurrently-running
		// thread. This creates just such a thread.
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				// The new thread starts running in this method.
				// All this method does is call the _setup method.
				_setup();
			}
		});
	}
	private static void _setup()
	{
		// You will add statements here
		GraphicsWindow drawbox = null;
		GraphicsWindow graphicsWindow = new GraphicsWindow();
		graphicsWindow = drawbox;
		Square medSquare = new Square(20, 20, 100);
		Square bigSquare = new Square(140, 140, 200);
		FlashingSquare smallSquare = new FlashingSquare(500, 200, 25);
		graphicsWindow.addShape(medSquare);
		graphicsWindow.addShape(bigSquare);
		graphicsWindow.addShape(smallSquare);
		
	}
}
