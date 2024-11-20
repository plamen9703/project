package school.frame;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import school.calendar.Date;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DropDown extends JFrame {

	private JPanel contentPane;
	Date dateArr[] = new Date[10];
	int numberOfDates;
 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DropDown frame = new DropDown();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DropDown() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 627, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDay = new JLabel("Day");
		lblDay.setBounds(44, 54, 56, 16);
		contentPane.add(lblDay);
		String[] days= new String[31];
		for( int i=0; i<days.length; i++) {
			days [i] = String.valueOf(i + 1);
		}
		JComboBox dayBox = new JComboBox();
		dayBox.setModel(new DefaultComboBoxModel(days));
		dayBox.setBounds(97, 51, 62, 22);
		contentPane.add(dayBox);
		String[] month= new String[12];
		for( int i=0; i<month.length; i++) {
			month [i] = String.valueOf(i + 1);
		}
		
		JLabel lblMonth = new JLabel("Month");
		lblMonth.setBounds(171, 57, 56, 16);
		contentPane.add(lblMonth);
		
		
		JComboBox monthBox = new JComboBox();
		monthBox.setModel(new DefaultComboBoxModel(month));
		monthBox.setBounds(251, 54, 62, 22);
		contentPane.add(monthBox);
		String[] year= new String[200];
		for( int i=0; i<year.length; i++) {
			year [i] = String.valueOf(i + 2000);
		}
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setBounds(358, 57, 56, 16);
		contentPane.add(lblYear);
		
		JComboBox yearBox = new JComboBox();
		yearBox.setModel(new DefaultComboBoxModel(year));
		yearBox.setBounds(411, 54, 62, 22);
		contentPane.add(yearBox);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(numberOfDates == dateArr.length) {
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showMessageDialog(null, "Vsichki dati sa zapulneni.","Info", JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				System.out.println(dayBox.getSelectedItem());
				System.out.println(monthBox.getSelectedItem());
				System.out.println(yearBox.getSelectedItem());
				int d = Integer.valueOf((String)dayBox.getSelectedItem());
				int m = Integer.valueOf((String)monthBox.getSelectedItem());
				int y = Integer.valueOf((String)yearBox.getSelectedItem());
				Date date = new Date(d, m, y);
				dateArr[numberOfDates]=date;
				numberOfDates++;
			}
			
		});
		btnCreate.setBounds(216, 150, 97, 25);
		contentPane.add(btnCreate);
	}
}
