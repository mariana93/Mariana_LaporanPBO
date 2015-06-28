package laporan_sembilan_event;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CobaEvent3 extends JFrame {
	JButton tombol;

	public CobaEvent3() {
		super("Event di swing");
		setLayout(new FlowLayout());
		setSize(500, 300);
		createLayout();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	public void createLayout(){
		tombol = new JButton("Klik");
		tombol.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				tombol.setText("Ok");
				
			}
		});
		add(tombol);
	}
	public static void main(String[] args){
		new CobaEvent3();
	}

}
