package laporan_Sembilan;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CobaBorder extends JFrame {

	public CobaBorder()  {
		super("BorderLayout");
		setSize(500, 300);
		createLayout();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		}
	public void createLayout(){
		add(BorderLayout.NORTH, new JButton("North"));
		add(BorderLayout.SOUTH, new JButton("South"));
		add(BorderLayout.EAST, new JButton("East"));
		add(BorderLayout.WEST, new JButton("West"));
		add(BorderLayout.CENTER, new JButton("Center"));
		
	}
	public static void main (String[] args) {
		new CobaBorder();
	}
	

}