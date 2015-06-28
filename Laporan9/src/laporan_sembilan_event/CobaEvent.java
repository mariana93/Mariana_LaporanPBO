package laporan_sembilan_event;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CobaEvent extends JFrame {
	JButton tombol;
	

	public CobaEvent() {
		super("event di swing");
		setLayout(new FlowLayout());
		setSize(500, 300);
		createLayout();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void createLayout() {
		tombol = new JButton("klik");
		tombol.addActionListener(new ButtonListener());
		add(tombol);
		
	}
	public static void main(String[] args){
		new CobaEvent();
	}

}
