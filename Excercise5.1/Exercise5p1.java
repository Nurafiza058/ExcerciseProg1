import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Exercise5p1 {

	private JFrame frame;
	private JTextField TextField1;
	private JTextField TextField2;
	private JTextField Answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercise5p1 window = new Exercise5p1();
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
	public Exercise5p1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 255, 232);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		TextField1 = new JTextField();
		TextField1.setBounds(10, 36, 86, 40);
		frame.getContentPane().add(TextField1);
		TextField1.setColumns(10);
		
		TextField2 = new JTextField();
		TextField2.setBounds(141, 36, 86, 40);
		frame.getContentPane().add(TextField2);
		TextField2.setColumns(10);
		
		JLabel AnswerLabel = new JLabel("ANSWER");
		AnswerLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		AnswerLabel.setBounds(10, 149, 69, 14);
		frame.getContentPane().add(AnswerLabel);
		
		JButton AddButton = new JButton("ADD");
		AddButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		AddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int number1,number2,ans;
				try {
					number1=Integer.parseInt(TextField1.getText());
					number2=Integer.parseInt(TextField2.getText());
					
					ans=number1 + number2;
					Answer.setText(Integer.toString(ans));
				}
				catch (Exception e1) {
					JOptionPane.showMessageDialog(null,"Please Enter Valid Number");
			
				}
			}
			
		});
		AddButton.setBounds(10, 87, 89, 38);
		frame.getContentPane().add(AddButton);
		
		Answer = new JTextField();
		Answer.setBounds(89, 136, 138, 40);
		frame.getContentPane().add(Answer);
		Answer.setColumns(10);
		
		JLabel NewLabel = new JLabel("Simple Calculator");
		NewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		NewLabel.setBounds(10, 11, 123, 16);
		frame.getContentPane().add(NewLabel);
		
		JButton MinusButton = new JButton("MINUS");
		MinusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int number1,number2,ans;
				try {
					number1=Integer.parseInt(TextField1.getText());
					number2=Integer.parseInt(TextField2.getText());
					
					ans=number1-number2;
					Answer.setText(Integer.toString(ans));
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
		});
		MinusButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		MinusButton.setBounds(138, 87, 89, 38);
		frame.getContentPane().add(MinusButton);
		
	
	}
}
