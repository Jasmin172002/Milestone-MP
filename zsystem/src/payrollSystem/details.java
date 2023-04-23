package payrollSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.Label;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class details {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					details window = new details();
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
	public details() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 700, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(24, 56, 176, 59);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblEmployeeId = new JLabel("Last Name");
		lblEmployeeId.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEmployeeId.setBounds(24, 86, 176, 59);
		frame.getContentPane().add(lblEmployeeId);
		
		JLabel lblBirrhday = new JLabel("Birthday");
		lblBirrhday.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBirrhday.setBounds(24, 125, 176, 48);
		frame.getContentPane().add(lblBirrhday);
		
		JLabel lblAddress = new JLabel("First Name");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAddress.setBounds(24, 166, 176, 37);
		frame.getContentPane().add(lblAddress);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Payroll p = new Payroll();
				p.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(24, 509, 122, 32);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Employee Information");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(233, 10, 204, 48);
		frame.getContentPane().add(lblNewLabel_1);
		
		JTextArea txtrJadaza_1 = new JTextArea();
		txtrJadaza_1.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtrJadaza_1.setEditable(false);
		txtrJadaza_1.setBounds(192, 107, 176, 22);
		frame.getContentPane().add(txtrJadaza_1);
		
		JTextArea txtrJadaza_1_1 = new JTextArea();
		txtrJadaza_1_1.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtrJadaza_1_1.setEditable(false);
		txtrJadaza_1_1.setBounds(192, 141, 176, 22);
		frame.getContentPane().add(txtrJadaza_1_1);
		
		JTextArea txtrJadaza_1_2 = new JTextArea();
		txtrJadaza_1_2.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtrJadaza_1_2.setEditable(false);
		txtrJadaza_1_2.setBounds(192, 176, 176, 22);
		frame.getContentPane().add(txtrJadaza_1_2);
		
		JLabel lblBirthday = new JLabel("Birthday");
		lblBirthday.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBirthday.setBounds(24, 202, 176, 37);
		frame.getContentPane().add(lblBirthday);
		
		JTextArea txtrJadaza_1_2_1 = new JTextArea();
		txtrJadaza_1_2_1.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtrJadaza_1_2_1.setEditable(false);
		txtrJadaza_1_2_1.setBounds(192, 212, 176, 22);
		frame.getContentPane().add(txtrJadaza_1_2_1);
		
		JLabel lblAddress_1 = new JLabel("Address");
		lblAddress_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAddress_1.setBounds(24, 237, 176, 37);
		frame.getContentPane().add(lblAddress_1);
		
		JTextArea txtrJadaza_1_2_1_1 = new JTextArea();
		txtrJadaza_1_2_1_1.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtrJadaza_1_2_1_1.setEditable(false);
		txtrJadaza_1_2_1_1.setBounds(192, 249, 176, 22);
		frame.getContentPane().add(txtrJadaza_1_2_1_1);
		
		JLabel lblAddress_1_1 = new JLabel("Phone Number");
		lblAddress_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAddress_1_1.setBounds(24, 270, 176, 37);
		frame.getContentPane().add(lblAddress_1_1);
		
		JTextArea txtrJadaza_1_2_1_1_1 = new JTextArea();
		txtrJadaza_1_2_1_1_1.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtrJadaza_1_2_1_1_1.setEditable(false);
		txtrJadaza_1_2_1_1_1.setBounds(192, 284, 176, 22);
		frame.getContentPane().add(txtrJadaza_1_2_1_1_1);
		
		JLabel lblAddress_1_1_1 = new JLabel("SSS #");
		lblAddress_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAddress_1_1_1.setBounds(24, 308, 176, 37);
		frame.getContentPane().add(lblAddress_1_1_1);
		
		JTextArea txtrJadaza_1_2_1_1_1_1 = new JTextArea();
		txtrJadaza_1_2_1_1_1_1.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtrJadaza_1_2_1_1_1_1.setEditable(false);
		txtrJadaza_1_2_1_1_1_1.setBounds(192, 317, 176, 22);
		frame.getContentPane().add(txtrJadaza_1_2_1_1_1_1);
		
		JLabel lblAddress_1_1_1_1 = new JLabel("Philhealth #");
		lblAddress_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAddress_1_1_1_1.setBounds(24, 341, 176, 37);
		frame.getContentPane().add(lblAddress_1_1_1_1);
		
		JTextArea txtrJadaza_1_2_1_1_1_1_1 = new JTextArea();
		txtrJadaza_1_2_1_1_1_1_1.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtrJadaza_1_2_1_1_1_1_1.setEditable(false);
		txtrJadaza_1_2_1_1_1_1_1.setBounds(192, 349, 176, 22);
		frame.getContentPane().add(txtrJadaza_1_2_1_1_1_1_1);
		
		JLabel lblAddress_1_1_1_1_1 = new JLabel("Pag-ibig #");
		lblAddress_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAddress_1_1_1_1_1.setBounds(24, 376, 176, 37);
		frame.getContentPane().add(lblAddress_1_1_1_1_1);
		
		JTextArea txtrJadaza_1_2_1_1_1_1_1_1 = new JTextArea();
		txtrJadaza_1_2_1_1_1_1_1_1.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtrJadaza_1_2_1_1_1_1_1_1.setEditable(false);
		txtrJadaza_1_2_1_1_1_1_1_1.setBounds(192, 381, 176, 22);
		frame.getContentPane().add(txtrJadaza_1_2_1_1_1_1_1_1);
		
		JTextArea txtrJadaza_1_3 = new JTextArea();
		txtrJadaza_1_3.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtrJadaza_1_3.setEditable(false);
		txtrJadaza_1_3.setBounds(192, 75, 176, 22);
		frame.getContentPane().add(txtrJadaza_1_3);
	}
}
