package payrollSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;

public class Payroll {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payroll window = new Payroll();
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
	public Payroll() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 700, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("Employee");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				details d = new details();
				d.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(94, 94, 220, 94);
		frame.getContentPane().setLayout(null);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(btnNewButton);
		
		JButton btnTimesheet = new JButton("Timesheet");
		btnTimesheet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				timesheet t = new timesheet();
				t.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnTimesheet.setBounds(94, 203, 220, 94);
		btnTimesheet.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(btnTimesheet);
		
		JButton btnSalary = new JButton("Salary");
		btnSalary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salary s = new salary();
				s.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnSalary.setBounds(334, 313, 220, 94);
		btnSalary.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(btnSalary);
		
		JButton btnBenefits = new JButton("Benefits");
		btnBenefits.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				benefits b = new benefits();
				b.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnBenefits.setBounds(94, 313, 220, 94);
		btnBenefits.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(btnBenefits);
		
		JButton btnDeductions = new JButton("Deductions");
		btnDeductions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deductions de = new deductions();
				de.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnDeductions.setBounds(334, 94, 220, 94);
		btnDeductions.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(btnDeductions);
		
		JButton btnAbsences = new JButton("Absences");
		btnAbsences.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				absences a = new absences();
				a.frame.setVisible(true);
				frame.dispose();
			}
			
		});
		btnAbsences.setBounds(334, 203, 220, 94);
		btnAbsences.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(btnAbsences);
		
		JLabel lblNewLabel = new JLabel("Welcome!");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(214, 35, 220, 33);
		frame.getContentPane().add(lblNewLabel);
		
		
		
	}
}
