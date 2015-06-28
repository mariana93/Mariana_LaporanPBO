package laporan_Sembilan;

import javax.swing.JFrame;
import javax.swing.JButton;

public class ExtendsGUI extends JFrame {
	JButton button;
	
	public ExtendsGUI(){
		super("Hallo");
		button = new JButton("close");
		add(button);
		setSize(300, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	static ExtendsGUI gui ;
	public static void main (String[] args) {
		gui = new ExtendsGUI();
	}
	

	
}
