package CSE;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Friendship {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Friendship window = new Friendship();
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
	public Friendship() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 630, 545);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(38, 60, 61, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("FRIENSDHIP CALCULATOR");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 24));
		lblNewLabel_2.setBounds(144, 43, 347, 33);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("YOUR NAME");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		lblNewLabel_3.setBounds(48, 129, 169, 27);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("FRIEND'S NAME");
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		lblNewLabel_4.setBounds(48, 188, 169, 27);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(249, 129, 130, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(249, 188, 130, 30);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("CHECK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 Random r=new Random();
			 int res=r.nextInt(1,100);
			 JOptionPane.showMessageDialog(btnNewButton, "Your Friendship % is :"+ res);
			}
		});
		btnNewButton.setBounds(237, 294, 142, 38);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/dharavathmanjula/Downloads/istockphoto-1455172237-1024x1024.png"));
		lblNewLabel.setBounds(6, 6, 618, 505);
		frame.getContentPane().add(lblNewLabel);
	}
}
