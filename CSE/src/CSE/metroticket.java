package CSE;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;

public class metroticket {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metroticket window = new metroticket();
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
	public metroticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 512, 408);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Metro Ticket Booking");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblNewLabel.setBounds(136, 35, 266, 38);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(48, 132, 61, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		tb1 = new JTextField();
		tb1.setBounds(191, 127, 130, 26);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("from");
		lblNewLabel_2.setBounds(48, 177, 61, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"select", "KPHB", "JNTU", "NGRI"}));
		cb1.setBounds(191, 165, 120, 27);
		frame.getContentPane().add(cb1);
		
		JLabel lblNewLabel_3 = new JLabel("to");
		lblNewLabel_3.setBounds(48, 215, 61, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"select", "KPHB", "JNTU", "NGRI"}));
		cb2.setBounds(191, 211, 130, 27);
		frame.getContentPane().add(cb2);
		
		JLabel lblNewLabel_4 = new JLabel("tickets");
		lblNewLabel_4.setBounds(48, 254, 61, 16);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox cb3 = new JComboBox();
		cb3.setModel(new DefaultComboBoxModel(new String[] {"select", "1", "2", "3"}));
		cb3.setBounds(201, 260, 120, 27);
		frame.getContentPane().add(cb3);
		
		JButton btnNewButton = new JButton("book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=tb1.getText();
				String fs=(String) cb1.getSelectedItem();
				String ts=(String) cb2.getSelectedItem();
				String nt=(String) cb3.getSelectedItem();
				int t=Integer.parseInt(nt);
				int bill=0;
				if(fs.equals(ts)) {
					JOptionPane.showMessageDialog(btnNewButton, "check station name");
				}
				else {
					bill=40*t;
					JOptionPane.showMessageDialog(btnNewButton, " Hello "+n+" \nFROM: "+fs+"\n TO: "+ts+"\nTOTAL COST : "+bill);

				}
			}
		});
		btnNewButton.setBounds(164, 320, 117, 29);
		
		frame.getContentPane().add(btnNewButton);
	}

}
