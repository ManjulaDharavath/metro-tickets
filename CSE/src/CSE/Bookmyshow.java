package CSE;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bookmyshow {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bookmyshow window = new Bookmyshow();
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
	public Bookmyshow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 508, 367);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BookMyShow");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblNewLabel.setBounds(195, 31, 166, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("name");
		lblNewLabel_1.setBounds(56, 98, 61, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		tb1 = new JTextField();
		tb1.setBounds(159, 93, 130, 26);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Movie");
		lblNewLabel_2.setBounds(56, 150, 61, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"select", "RRR", "KGF-1", "KGF-2"}));
		c1.setBounds(170, 146, 119, 27);
		frame.getContentPane().add(c1);
		
		JLabel lblNewLabel_3 = new JLabel("Tickets");
		lblNewLabel_3.setBounds(56, 208, 61, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"select", "1", "2", "3"}));
		c2.setBounds(170, 203, 119, 26);
		frame.getContentPane().add(c2);
		
		JButton btnNewButton = new JButton("BOOK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=tb1.getText();
				String sm=(String) c1.getSelectedItem();
				String nt=(String) c2.getSelectedItem();
				int t=Integer.parseInt(nt);
				int bill=0;
				if(sm.equals("RRR"))
				{
					bill=400*t;
					JOptionPane.showMessageDialog(btnNewButton, "Hello "+n +"\n selected movie:"+sm+"\n Tickets:"+t
							+ "\n Your Bill:" +bill);
				}
				else if(sm.equals("KGF-1"))
				{
					bill=500*t;
					JOptionPane.showMessageDialog(btnNewButton, "Hello "+n +"\n selected movie:"+sm+"\n Tickets:"+t
							+ "\n Your Bill:" +bill);
				}
				else if(sm.equals("KGF-2"))
				{
					bill=400*t;
					JOptionPane.showMessageDialog(btnNewButton, "Hello "+n +"\n selected movie:"+sm+"\n Tickets:"+t
							+ "\n Your Bill:" +bill);
				}
				
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "Hello select the movie");
				}
			}
		});
		btnNewButton.setBounds(172, 264, 117, 29);
		frame.getContentPane().add(btnNewButton);
	}
}
