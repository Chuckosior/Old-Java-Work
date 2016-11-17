import javax.swing.JFrame;
public class GraphicsWindow extends JFrame
{
	private DrawingPanel _drawingPanel;
	private static final long serialVersionUID = 1L;
	public GraphicsWindow()
	{
		DrawingPanel drawingPanel = new DrawingPanel();
		_drawingPanel = drawingPanel;
		this.setContentPane(drawingPanel);
		this.setSize(600, 400);
		this.setVisible(true);
	}
	public static void addShape(Square sq) {
		DrawingPanel.addShape(sq);
	}
}
