package laporan_sembilan_event;

import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CobaEventText extends JFrame {
	JTextField textField;
	JTextField textField2;
	

	public CobaEventText() {
		super("event di swing");
		setLayout(new FlowLayout());
		setSize(500, 300);
		createLayout();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	private void createLayout(){
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			public void KeyReleased(KeyEvent even){
				textField2.setText(textField.getText());
		}
		});
		textField.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent event) {
				
			}
			
			public void mousePressed(MouseEvent event) {
				
			}
		
			public void mouseExited(MouseEvent event) {
				
			}
			
			public void mouseEntered(MouseEvent event) {
				
			}
			
			public void mouseClicked(MouseEvent event) {
				
			}
		});
		textField.setColumns(20);
		add(textField);
		textField2 = new JTextField();
		textField2.setColumns(20);
		add(textField2);
		
	}
	public static void main (String args[]) {
		new CobaEvent3();
	}

}
