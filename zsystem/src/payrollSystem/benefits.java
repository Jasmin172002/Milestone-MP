package payrollSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

public class benefits {

	 JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					benefits window = new benefits();
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
	public benefits() {
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
		
		JLabel lblNewLabel = new JLabel("Benefits");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(258, 0, 139, 65);
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
		btnNewButton.setBounds(30, 510, 122, 32);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Pay-Period");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(43, 150, 152, 38);
		frame.getContentPane().add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"January", "February", "March"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 17));
		comboBox.setBounds(200, 158, 109, 22);
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton_1 = new JButton("Enter");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1.setBounds(438, 157, 91, 25);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Rice Subsidy");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_1.setBounds(43, 214, 152, 38);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JTextArea txtrJasminPascual = new JTextArea();
		txtrJasminPascual.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtrJasminPascual.setEditable(false);
		txtrJasminPascual.setBounds(200, 222, 152, 22);
		frame.getContentPane().add(txtrJasminPascual);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Phone Allowance");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_1_1.setBounds(43, 249, 152, 38);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JTextArea txtrJasminPascual_1 = new JTextArea();
		txtrJasminPascual_1.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtrJasminPascual_1.setEditable(false);
		txtrJasminPascual_1.setBounds(200, 257, 152, 22);
		frame.getContentPane().add(txtrJasminPascual_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Clothing Allowance");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_1_1_1.setBounds(43, 289, 152, 38);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JTextArea txtrJasminPascual_1_1 = new JTextArea();
		txtrJasminPascual_1_1.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtrJasminPascual_1_1.setEditable(false);
		txtrJasminPascual_1_1.setBounds(200, 297, 152, 22);
		frame.getContentPane().add(txtrJasminPascual_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Total ");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_1_1_1_1.setBounds(43, 368, 152, 38);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_1);
		
		JTextArea txtrJasminPascual_1_1_1 = new JTextArea();
		txtrJasminPascual_1_1_1.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtrJasminPascual_1_1_1.setEditable(false);
		txtrJasminPascual_1_1_1.setBounds(205, 376, 147, 22);
		frame.getContentPane().add(txtrJasminPascual_1_1_1);
		
		JButton btnNewButton_2 = new JButton("Calculate");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(287, 462, 120, 21);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Employee ID");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(43, 51, 120, 30);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JTextArea txtrJasminPascual_2 = new JTextArea();
		txtrJasminPascual_2.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtrJasminPascual_2.setEditable(false);
		txtrJasminPascual_2.setBounds(201, 56, 151, 22);
		frame.getContentPane().add(txtrJasminPascual_2);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Employee Name");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_2.setBounds(43, 78, 120, 30);
		frame.getContentPane().add(lblNewLabel_1_1_2);
		
		JTextArea txtrJasminPascual_2_1 = new JTextArea();
		txtrJasminPascual_2_1.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtrJasminPascual_2_1.setEditable(false);
		txtrJasminPascual_2_1.setBounds(200, 88, 151, 22);
		frame.getContentPane().add(txtrJasminPascual_2_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"2020", "2021", "2022", "2023"}));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		comboBox_1.setBounds(319, 158, 109, 22);
		frame.getContentPane().add(comboBox_1);
	}

}
