package laporan_Sembilan;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Gui {

	public static void main(String[] args) throws Exception {
		JFrame frame = new JFrame("Laporan sembilan");
		JLabel label = new JLabel("Nama");
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 100);
		frame.setVisible(true);
		
	}

}
