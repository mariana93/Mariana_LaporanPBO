package laporan_sembilan_event;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class cobaEventB extends JFrame {
	JButton tombol;

	public cobaEventB() {
		super("event di swing");
		setLayout(new FlowLayout());
		setSize(500, 300);
		createLayout();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void createLayout(){
		tombol = new JButton("klik");
		tombol.addActionListener(new ButtonListener());
		add(tombol);
	}
	class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			tombol.setText("OK");
		}
	}
	public static void main(String[] args){
		new cobaEventB();
	}

}
