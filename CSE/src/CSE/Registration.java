package CSE;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registration {

	private JFrame frame;
	private JTextField name;
	private JTextField mail;
	private JTextField phn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration window = new Registration();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setBounds(157, 22, 125, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(36, 90, 61, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		name = new JTextField();
		name.setBounds(138, 87, 130, 26);
		frame.getContentPane().add(name);
		name.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Email Id");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(36, 134, 82, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		mail = new JTextField();
		mail.setBounds(138, 131, 130, 26);
		frame.getContentPane().add(mail);
		mail.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Ph no");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(36, 172, 61, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		phn = new JTextField();
		phn.setBounds(138, 169, 130, 26);
		frame.getContentPane().add(phn);
		phn.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String un=name.getText();
			    
			    //JOptionPane.showMessageDialog(btnNewButton, "Hello " + un + " Registration done");
			Login l=new Login();
			l.setVisible(true);
			frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(181, 219, 117, 29);
		frame.getContentPane().add(btnNewButton);
	}

}
