package payrollSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class deductions {

	 JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					deductions window = new deductions();
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
	public deductions() {
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
		
		JLabel lblNewLabel = new JLabel("Deductions");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(271, -17, 133, 99);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Payroll p = new Payroll();
				p.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(21, 509, 122, 32);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1_2 = new JLabel("Employee ID");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(46, 56, 120, 30);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JTextArea txtrJasminPascual_2 = new JTextArea();
		txtrJasminPascual_2.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtrJasminPascual_2.setEditable(false);
		txtrJasminPascual_2.setBounds(176, 59, 151, 22);
		frame.getContentPane().add(txtrJasminPascual_2);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Employee Name");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_2.setBounds(46, 84, 120, 30);
		frame.getContentPane().add(lblNewLabel_1_1_2);
		
		JTextArea txtrJasminPascual_2_1 = new JTextArea();
		txtrJasminPascual_2_1.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtrJasminPascual_2_1.setEditable(false);
		txtrJasminPascual_2_1.setBounds(176, 89, 151, 22);
		frame.getContentPane().add(txtrJasminPascual_2_1);
		
		JLabel lblNewLabel_1 = new JLabel("Month");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(46, 184, 152, 38);
		frame.getContentPane().add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"January", "February", "March"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 17));
		comboBox.setBounds(177, 192, 109, 22);
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton_1 = new JButton("Enter");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1.setBounds(418, 191, 91, 25);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Government Monthly Contribution Amount");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_1.setBounds(46, 232, 395, 38);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("SSS");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_3.setBounds(46, 280, 152, 38);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Pag-ibig");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_4.setBounds(46, 310, 152, 38);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Philhealth");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_5.setBounds(46, 338, 152, 38);
		frame.getContentPane().add(lblNewLabel_1_5);
		
		JTextArea txtrJasminPascual_2_1_1 = new JTextArea();
		txtrJasminPascual_2_1_1.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtrJasminPascual_2_1_1.setEditable(false);
		txtrJasminPascual_2_1_1.setBounds(176, 288, 151, 22);
		frame.getContentPane().add(txtrJasminPascual_2_1_1);
		
		JTextArea txtrJasminPascual_2_1_2 = new JTextArea();
		txtrJasminPascual_2_1_2.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtrJasminPascual_2_1_2.setEditable(false);
		txtrJasminPascual_2_1_2.setBounds(176, 318, 151, 22);
		frame.getContentPane().add(txtrJasminPascual_2_1_2);
		
		JTextArea txtrJasminPascual_2_1_3 = new JTextArea();
		txtrJasminPascual_2_1_3.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtrJasminPascual_2_1_3.setEditable(false);
		txtrJasminPascual_2_1_3.setBounds(176, 346, 151, 22);
		frame.getContentPane().add(txtrJasminPascual_2_1_3);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Basic Salary");
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_2_1.setBounds(46, 110, 120, 30);
		frame.getContentPane().add(lblNewLabel_1_1_2_1);
		
		JTextArea txtrJasminPascual_2_1_4 = new JTextArea();
		txtrJasminPascual_2_1_4.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtrJasminPascual_2_1_4.setEditable(false);
		txtrJasminPascual_2_1_4.setBounds(176, 121, 151, 22);
		frame.getContentPane().add(txtrJasminPascual_2_1_4);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("Total");
		lblNewLabel_1_5_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_5_1.setBounds(46, 386, 152, 38);
		frame.getContentPane().add(lblNewLabel_1_5_1);
		
		JTextArea txtrJasminPascual_2_1_3_1 = new JTextArea();
		txtrJasminPascual_2_1_3_1.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtrJasminPascual_2_1_3_1.setEditable(false);
		txtrJasminPascual_2_1_3_1.setBounds(176, 394, 151, 22);
		frame.getContentPane().add(txtrJasminPascual_2_1_3_1);
		
		JButton btnNewButton_2 = new JButton("Calculate");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(267, 470, 120, 21);
		frame.getContentPane().add(btnNewButton_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"2020", "2021", "2022", "2023"}));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		comboBox_1.setBounds(295, 192, 109, 22);
		frame.getContentPane().add(comboBox_1);
	}

}
