package CSE;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private JTextField tb1;
	private JPasswordField ps1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 24));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(156, 22, 87, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("UserName");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(24, 105, 122, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(24, 143, 122, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		tb1 = new JTextField();
		tb1.setBounds(140, 102, 130, 26);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		ps1 = new JPasswordField();
		ps1.setBounds(140, 144, 130, 26);
		frame.getContentPane().add(ps1);
		ps1.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(btnNewButton, "Login successful");
			    String un=tb1.getText();
			    String ps=ps1.getText();
			    if(un.equals("manjula") && ps.equals("12345"))
			    {
			    	JOptionPane.showMessageDialog(btnNewButton, "Login successful");
			    }
			    else
			    {
			    	JOptionPane.showMessageDialog(btnNewButton, "Invalid");
			    }
			}
		});
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.setBounds(126, 211, 117, 29);
		frame.getContentPane().add(btnNewButton);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(true);
		
	}
}
