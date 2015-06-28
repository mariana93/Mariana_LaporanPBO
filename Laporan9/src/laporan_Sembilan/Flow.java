package laporan_Sembilan;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Flow extends JFrame {
	public Flow() {
		super("BorderLayout");
		setLayout(new FlowLayout());
		setSize(500, 300);
		createLayout();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void createLayout() {
		
		for (int i = 0; i < 10; i++)
			add (new JButton("Tombol " +i));
	}
	public static void main(String[] args) {
		new Flow();
	}

}
