package laporan_sembilan_event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class CobaListener implements ActionListener {
	JButton tombol;
	public CobaListener(JButton Tombol) {
		this.tombol = tombol;
		}
	public void actionPerformed(ActionEvent even){
		tombol.setText("Ok");
	}

}
