import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.Timer;

public class DrawingPanel extends JPanel implements ActionListener, MouseListener
{
	private static ArrayList<Shape> _shapes = new ArrayList<Shape>();
	private static final long serialVersionUID = 1L;
	
	public static void addShape(Shape shape)
	{
		_shapes.add(shape);
	}
	public DrawingPanel()
	{
		this.addMouseListener(this);
		this.setBackground(Color.WHITE);
		Timer timer = new Timer(20, this);
		timer.start();
	}
	@Override
	public void actionPerformed(ActionEvent aev)
	{
		this.repaint();
	}
	@Override
	public void paint(Graphics g)
	{
	 super.paint(g);
	 for(Shape shape: _shapes)
	 shape.paint(g);
	}
	@Override 
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent mev) {
		Point p = mev.getPoint();
		for(Shape shape: _shapes)
			if(shape.contains(p))
				shape.mousePressed(mev);
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}