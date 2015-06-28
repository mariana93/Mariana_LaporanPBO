package laporan_Sembilan;

import javax.swing.JFrame;
import javax.swing.JButton;

public class Absolut  extends JFrame{
	JButton tombol1;
	JButton tombol2;
	JButton tombol3;

	public Absolut() {
		super("Layout Absolut");
		setLayout(null);
		setSize(500, 300);
		createLayout();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void createLayout(){
		tombol1 = new JButton("Tombol 1");
		tombol1.setBounds(10, 10, 150, 30);
		
		tombol2 = new JButton("Tombol 2");
		tombol2.setBounds(100, 50, 100, 30);
		
		tombol3 = new JButton("Tombol 3");
		tombol3.setBounds(150, 150, 150, 100);
		add(tombol1);
		add(tombol2);
		add(tombol3);
	
	}
	public static void main(String[] args) {
		new Absolut();
	}

}
