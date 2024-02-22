package CSE;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Amazon {

	private JFrame frame;
	int i=0;
    int bill=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Amazon window = new Amazon();
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
	public Amazon() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 596, 518);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AMAZON");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblNewLabel.setBounds(183, 26, 114, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("/Users/dharavathmanjula/Desktop/Screenshot 2024-02-21 at 12.12.03 PM.png"));
		lblNewLabel_1.setBounds(25, 104, 194, 297);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("/Users/dharavathmanjula/Desktop/Screenshot 2024-02-21 at 12.15.01 PM.png"));
		lblNewLabel_2.setBounds(322, 104, 223, 297);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("250/-");
		lblNewLabel_3.setBounds(74, 424, 61, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("300/-");
		lblNewLabel_4.setBounds(405, 424, 61, 16);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lb = new JLabel("CART : 0");
		lb.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lb.setBounds(446, 26, 128, 25);
		frame.getContentPane().add(lb);
		
		JLabel lb2 = new JLabel("BILL:0");
		lb2.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lb2.setBounds(446, 63, 128, 25);
		frame.getContentPane().add(lb2);
		
		JButton btnNewButton = new JButton("ADD TO CART");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				
				lb.setText("CART: "+i);
				bill=bill+250;
				lb2.setText("BILL: "+bill);
			}
		});
		
		btnNewButton.setBounds(49, 452, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ADD TO CART");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				
				
				lb.setText("CART: "+i);
				bill=bill+300;
				lb2.setText("BILL: "+bill);
			}
		});
		btnNewButton_1.setBounds(372, 452, 117, 29);
		frame.getContentPane().add(btnNewButton_1);
		
		
	}
}
