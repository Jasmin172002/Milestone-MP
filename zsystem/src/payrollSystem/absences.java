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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class absences {

	 JFrame frame;
	 private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					absences window = new absences();
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
	public absences() {
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
		
		JLabel lblNewLabel = new JLabel("Absences");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(264, 0, 198, 73);
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
		btnNewButton.setBounds(21, 510, 122, 32);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Employee ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(44, 66, 120, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Employee Name");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(44, 90, 120, 30);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JTextArea txtrJasminPascual_2 = new JTextArea();
		txtrJasminPascual_2.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtrJasminPascual_2.setEditable(false);
		txtrJasminPascual_2.setBounds(178, 69, 151, 22);
		frame.getContentPane().add(txtrJasminPascual_2);
		
		JTextArea txtrJasminPascual_2_1 = new JTextArea();
		txtrJasminPascual_2_1.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtrJasminPascual_2_1.setEditable(false);
		txtrJasminPascual_2_1.setBounds(178, 98, 151, 22);
		frame.getContentPane().add(txtrJasminPascual_2_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Search by Month");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1.setBounds(37, 150, 127, 30);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"January", "February"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 17));
		comboBox.setBounds(178, 157, 109, 22);
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton_1 = new JButton("Enter");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1.setBounds(416, 155, 91, 25);
		frame.getContentPane().add(btnNewButton_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Month", "Date", "Reason", "Deduction Amount"},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(90);
		table.getColumnModel().getColumn(1).setPreferredWidth(90);
		table.getColumnModel().getColumn(2).setPreferredWidth(90);
		table.getColumnModel().getColumn(3).setPreferredWidth(90);
		table.setFont(new Font("Tahoma", Font.BOLD, 13));
		table.setBounds(33, 222, 626, 146);
		frame.getContentPane().add(table);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Total Amount");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(179, 397, 163, 30);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JTextArea txtrJasminPascual_2_1_1 = new JTextArea();
		txtrJasminPascual_2_1_1.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtrJasminPascual_2_1_1.setEditable(false);
		txtrJasminPascual_2_1_1.setBounds(299, 400, 151, 22);
		frame.getContentPane().add(txtrJasminPascual_2_1_1);
		
		JButton btnNewButton_2 = new JButton("Calculate");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(252, 466, 120, 21);
		frame.getContentPane().add(btnNewButton_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"2020", "2021", "2022", "2023"}));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		comboBox_1.setBounds(297, 157, 109, 22);
		frame.getContentPane().add(comboBox_1);
	}
}
