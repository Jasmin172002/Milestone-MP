package payrollSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class timesheet {

	 JFrame frame;
	 private JTable table;
	 private JTable table_1;
	 private JTable table_2;
	 private JTable table_3;
	 private JTable table_4;
	 private JTable table_5;
	 private JTable table_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					timesheet window = new timesheet();
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
	public timesheet() {
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
		
		JLabel lblNewLabel = new JLabel("Timesheet");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(215, 15, 224, 40);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Employee ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(28, 61, 120, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Employee Name");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(28, 94, 120, 30);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JTextArea txtrJasminPascual = new JTextArea();
		txtrJasminPascual.setEditable(false);
		txtrJasminPascual.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtrJasminPascual.setBounds(158, 99, 151, 22);
		frame.getContentPane().add(txtrJasminPascual);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Payroll p = new Payroll();
				p.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(28, 509, 122, 32);
		frame.getContentPane().add(btnNewButton);
		
		JList list = new JList();
		list.setBounds(257, 296, 83, -17);
		frame.getContentPane().add(list);
		
		JList list_1 = new JList();
		list_1.setBounds(179, 364, 173, -28);
		frame.getContentPane().add(list_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Search by Month");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1.setBounds(28, 157, 127, 30);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 17));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"January", "February"}));
		comboBox.setBounds(158, 160, 109, 22);
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton_1 = new JButton("Enter");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1.setBounds(396, 159, 91, 25);
		frame.getContentPane().add(btnNewButton_1);
		
		table_2 = new JTable();
		table_2.setBackground(new Color(0, 128, 255));
		table_2.setBounds(502, 249, -99, -66);
		frame.getContentPane().add(table_2);
		
		table_3 = new JTable();
		table_3.setBounds(190, 394, 227, -66);
		frame.getContentPane().add(table_3);
		
		table_4 = new JTable();
		table_4.setBounds(131, 37, 1, 1);
		frame.getContentPane().add(table_4);
		
		table_5 = new JTable();
		table_5.setBounds(203, 296, 1, 1);
		frame.getContentPane().add(table_5);
		
		table_6 = new JTable();
		table_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		table_6.setModel(new DefaultTableModel(
			new Object[][] {
				{"Month", "Day", "Time-In", "Time-Out", "Total Hour(s)", "Overtime Hour(s)"},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, "", null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"Month", "Day", "Time-In", "Time-Out", "Total Hour(s)", "Overtime Hour(s)"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, true, true, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_6.getColumnModel().getColumn(0).setResizable(false);
		table_6.getColumnModel().getColumn(5).setPreferredWidth(97);
		table_6.setBounds(28, 222, 626, 160);
		frame.getContentPane().add(table_6);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Total Hours Worked");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(177, 394, 163, 30);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JTextArea txtrJasminPascual_1 = new JTextArea();
		txtrJasminPascual_1.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtrJasminPascual_1.setEditable(false);
		txtrJasminPascual_1.setBounds(325, 402, 151, 22);
		frame.getContentPane().add(txtrJasminPascual_1);
		
		JButton btnNewButton_2 = new JButton("Calculate");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(257, 466, 120, 21);
		frame.getContentPane().add(btnNewButton_2);
		
		JTextArea txtrJasminPascual_2 = new JTextArea();
		txtrJasminPascual_2.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtrJasminPascual_2.setEditable(false);
		txtrJasminPascual_2.setBounds(158, 66, 151, 22);
		frame.getContentPane().add(txtrJasminPascual_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"2020", "2021", "2022", "2023"}));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		comboBox_1.setBounds(277, 160, 109, 22);
		frame.getContentPane().add(comboBox_1);
		
		
	}
}
