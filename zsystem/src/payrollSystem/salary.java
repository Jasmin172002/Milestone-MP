package payrollSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;

public class salary {

	 JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					salary window = new salary();
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
	public salary() {
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
		
		JLabel lblNewLabel = new JLabel("Salary");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(273, 0, 82, 68);
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
		btnNewButton.setBounds(26, 510, 122, 32);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Employee ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(26, 58, 122, 37);
		frame.getContentPane().add(lblNewLabel_1);
		
		JTextArea txtrJasminPascual = new JTextArea();
		txtrJasminPascual.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtrJasminPascual.setEditable(false);
		txtrJasminPascual.setBounds(154, 64, 151, 22);
		frame.getContentPane().add(txtrJasminPascual);
		
		JLabel lblNewLabel_1_1 = new JLabel("Employee Name");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(28, 91, 120, 30);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JTextArea txtrJasminPascual_1 = new JTextArea();
		txtrJasminPascual_1.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtrJasminPascual_1.setEditable(false);
		txtrJasminPascual_1.setBounds(154, 96, 151, 22);
		frame.getContentPane().add(txtrJasminPascual_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Pay-Period");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_2.setBounds(26, 146, 152, 38);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"January", "February"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 17));
		comboBox.setBounds(188, 154, 109, 22);
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton_1 = new JButton("Enter");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1.setBounds(428, 153, 91, 25);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Total Hours Worked");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_2_1.setBounds(26, 186, 152, 38);
		frame.getContentPane().add(lblNewLabel_1_2_1);
		
		JTextArea txtrJasminPascual_1_1 = new JTextArea();
		txtrJasminPascual_1_1.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtrJasminPascual_1_1.setEditable(false);
		txtrJasminPascual_1_1.setBounds(188, 194, 151, 22);
		frame.getContentPane().add(txtrJasminPascual_1_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Hourly Rate");
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_2_1_1.setBounds(26, 214, 152, 38);
		frame.getContentPane().add(lblNewLabel_1_2_1_1);
		
		JTextArea txtrJasminPascual_1_1_1 = new JTextArea();
		txtrJasminPascual_1_1_1.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtrJasminPascual_1_1_1.setEditable(false);
		txtrJasminPascual_1_1_1.setBounds(188, 224, 151, 22);
		frame.getContentPane().add(txtrJasminPascual_1_1_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Overtime");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxNewCheckBox.setBounds(22, 258, 139, 32);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxAbscences = new JCheckBox("Abscences");
		chckbxAbscences.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxAbscences.setBounds(22, 285, 139, 32);
		frame.getContentPane().add(chckbxAbscences);
		
		JCheckBox chckbxTax = new JCheckBox("Tax");
		chckbxTax.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxTax.setBounds(22, 309, 139, 32);
		frame.getContentPane().add(chckbxTax);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("Total Salary");
		lblNewLabel_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_2_1_1_1.setBounds(26, 347, 152, 38);
		frame.getContentPane().add(lblNewLabel_1_2_1_1_1);
		
		JTextArea txtrJasminPascual_1_1_1_1 = new JTextArea();
		txtrJasminPascual_1_1_1_1.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtrJasminPascual_1_1_1_1.setEditable(false);
		txtrJasminPascual_1_1_1_1.setBounds(188, 357, 151, 22);
		frame.getContentPane().add(txtrJasminPascual_1_1_1_1);
		
		JButton btnNewButton_2 = new JButton("Calculate");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(309, 462, 120, 21);
		frame.getContentPane().add(btnNewButton_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"2020", "2021", "2022", "2023"}));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		comboBox_1.setBounds(309, 154, 109, 22);
		frame.getContentPane().add(comboBox_1);
	}
}

