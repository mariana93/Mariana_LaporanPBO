package laporan_Sembilan;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Grid extends JFrame {
	public Grid() {
		super("BorderLayout");
		setLayout(new GridLayout(7, 3));
		setSize(500, 300);
		createLayout();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	public void createLayout(){
		for (int i = 0; i< 10; i++)
			add(new JButton("Tombol " + i));
	}
	public static void main (String[] args) {
		new Grid();
	}

}
