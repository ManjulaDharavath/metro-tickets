package CSE;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Studentregistration {

	private JFrame frame;
	private JComboBox cb1;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Studentregistration window = new Studentregistration();
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
	public Studentregistration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Lucida Grande", Font.BOLD, 20));
		frame.setBounds(100, 100, 540, 390);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTRATION");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblNewLabel.setBounds(127, 21, 160, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(42, 91, 61, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("BRANCH");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(41, 130, 81, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("GENDER");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(42, 170, 80, 23);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("PROGRAMMING LANG");
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(42, 205, 197, 34);
		frame.getContentPane().add(lblNewLabel_4);
		
		cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "CSE", "IT", "AIML", "CIVIL"}));
		cb1.setBounds(255, 131, 130, 26);
		frame.getContentPane().add(cb1);
		
		tb1 = new JTextField();
		tb1.setBounds(255, 88, 130, 26);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JRadioButton R1 = new JRadioButton("MALE");
		R1.setBounds(255, 171, 81, 23);
		frame.getContentPane().add(R1);
		
		JRadioButton R2 = new JRadioButton("FEMALE");
		R2.setBounds(335, 171, 85, 23);
		frame.getContentPane().add(R2);
		
		ButtonGroup bg= new ButtonGroup();
		bg.add(R1);
		bg.add(R2);
		
		JCheckBox p1 = new JCheckBox("JAVA");
		p1.setBounds(257, 212, 69, 23);
		frame.getContentPane().add(p1);
		
		JCheckBox p2 = new JCheckBox("PYTHON");
		p2.setBounds(330, 212, 85, 23);
		frame.getContentPane().add(p2);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=tb1.getText(); 
				String b=(String) cb1.getSelectedItem();
				String g;
				if(R1.isSelected())
				{
					g="MALE";
				}
				else if(R2.isSelected())
				{
					g="FEMALE";
				}
				else
				{
					g="Invalid";
				}
				String c1="";
				if(p1.isSelected())
				{
					c1=c1+ " JAVA ";
					
				}
				if(p2.isSelected())
				{
					c1=c1 +"PYTHON";
				}
				int res=0;
		        res=JOptionPane.showConfirmDialog(btnNewButton, "Hello " + n +"\nPlease confirm your details : \nBranch :" +b +"\n Gender :"
		        		+ g+ "\nProgramming languages: "+ c1);
		        if(res==JOptionPane.YES_OPTION)
		        {
		        	JOptionPane.showMessageDialog(btnNewButton,"Reg Done" );
		        }
		        else
		        {
		        	JOptionPane.showMessageDialog(btnNewButton,"Reg Cancelled" );
		        }
				
			}
		});
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		btnNewButton.setBounds(218, 303, 117, 29);
		frame.getContentPane().add(btnNewButton);
	}
}
