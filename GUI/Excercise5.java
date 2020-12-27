import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Excercise5 {

	private JFrame frame;
	private JTextField textFieldNumber1;
	private JTextField textFieldNumber2;
	private JTextField textFieldAnswer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Excercise5 window = new Excercise5();
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
	public Excercise5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 502, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Simple Calculator");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(25, 11, 117, 25);
		frame.getContentPane().add(lblNewLabel);
		
		textFieldNumber1 = new JTextField();
		textFieldNumber1.setBounds(20, 40, 214, 34);
		frame.getContentPane().add(textFieldNumber1);
		textFieldNumber1.setColumns(10);
		
		textFieldNumber2 = new JTextField();
		textFieldNumber2.setBounds(252, 40, 224, 34);
		frame.getContentPane().add(textFieldNumber2);
		textFieldNumber2.setColumns(10);
		
		JButton btnNewButtonAdd = new JButton("ADD");
		btnNewButtonAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int number1,number2,ans;
				try {
					number1=Integer.parseInt(textFieldNumber1.getText());
					number2=Integer.parseInt(textFieldNumber2.getText());
					
					ans=number1 + number2;
					textFieldAnswer.setText(Integer.toString(ans));
				} catch (Exception e) {
					
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
				
			
		});
		btnNewButtonAdd.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButtonAdd.setBounds(20, 88, 107, 41);
		frame.getContentPane().add(btnNewButtonAdd);
		
		JButton btnNewButtonMinus = new JButton("MINUS ");
		btnNewButtonMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int number1,number2,ans;
				try {
					number1=Integer.parseInt(textFieldNumber1.getText());
					number2=Integer.parseInt(textFieldNumber2.getText());
					
					ans=number1 - number2;
					textFieldAnswer.setText(Integer.toString(ans));
				} catch (Exception e) {
					
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			
			}
		});
		btnNewButtonMinus.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButtonMinus.setBounds(137, 88, 107, 41);
		frame.getContentPane().add(btnNewButtonMinus);
		
		JButton btnNewButtonMultiply = new JButton("MULTIPLY");
		btnNewButtonMultiply.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButtonMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int number1,number2,ans;
				try {
					number1=Integer.parseInt(textFieldNumber1.getText());
					number2=Integer.parseInt(textFieldNumber2.getText());
					
					ans=number1 * number2;
					textFieldAnswer.setText(Integer.toString(ans));
				} catch (Exception e) {
					
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
			
		});
		btnNewButtonMultiply.setBounds(252, 88, 107, 41);
		frame.getContentPane().add(btnNewButtonMultiply);
		
		JButton btnNewButtonDivide = new JButton("DIVIDE");
		btnNewButtonDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int number1,number2,ans;
				try {
					number1=Integer.parseInt(textFieldNumber1.getText());
					number2=Integer.parseInt(textFieldNumber2.getText());
					
					ans=number1 / number2;
					textFieldAnswer.setText(Integer.toString(ans));
				} catch (Exception e) {
					
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
			
		});
		btnNewButtonDivide.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButtonDivide.setBounds(369, 88, 107, 41);
		frame.getContentPane().add(btnNewButtonDivide);
		
		textFieldAnswer = new JTextField();
		textFieldAnswer.setBounds(169, 140, 307, 60);
		frame.getContentPane().add(textFieldAnswer);
		textFieldAnswer.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("The Answer is");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(25, 152, 134, 25);
		frame.getContentPane().add(lblNewLabel_1);
	}

}
