import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Login extends JFrame {

	private Container c;
	private JTextField tf;
	private JPasswordField pf;
	private JButton b, cb;
	private JLabel l,l1;

	Login() {
		doo();
	}

	public void doo() {
		tf = new JTextField();
		tf.setBounds(150,50,200,40);

		pf = new JPasswordField();
		pf.setBounds(150,100,200,40);
		pf.setEchoChar('*');
		
		l = new JLabel("UserName: ");
		l.setBounds(30,50,100,40);
		
		l1 = new JLabel("Password: ");
		l1.setBounds(30,100,100,40);
		

		cb = new JButton("CLEAR");
		cb.setBounds(200,200,90,50);
		
		cb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent a)
			{
				
				tf.setText("");
				pf.setText("");
				
			}
			
			
		});

		b = new JButton("LOGIN");
		b.setBounds(100, 200, 90, 50);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = tf.getText();
				String p = pf.getText();
				if (s.equals("boss") && p.equals("123")) {

					JOptionPane.showMessageDialog(null, "Wellcome!!");
				} else {
					JOptionPane.showMessageDialog(null,
							"Wrong user or password ! ");

				}

			}

		});
		c = this.getContentPane();
		c.setBackground(Color.ORANGE);
		c.setLayout(null);
		c.add(b);
		c.add(tf);
		c.add(pf);
		c.add(cb);
		c.add(l);
		c.add(l1);
	}

	public static void main(String args[]) {
		Login frame = new Login();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setBounds(330, 200, 400, 400);

	}
}
