package calculate;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class CalculatorBackup extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	private String[] rememberNumber;	
	private int tempNumber= 0;
	private int convertNumber=0;
	
	String lastNumber = "";			 
	String lastOperator = "";		  
	String operator ="";			 
	String getTextField ="";		  
	String getResultTextField ="";   
	private int resultFieldNumber = 0;  
	int cal = 0;   						
	private int resultNumber = 0;		

	private JTextField resultTextField;

	
	
	
			private ActionListener clickButton = (new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					lastNumber += e.getActionCommand();
					cal = Integer.parseInt(lastNumber); 
					textField.setText(textField.getText()+e.getActionCommand());
				}
			});
			
			
			private ActionListener clearButton = (new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					textField.setText("");
					resultTextField.setText("");
					lastNumber="";
				}
			});
	
		
			private ActionListener calNumber = (new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
						getTextField = textField.getText();
						getResultTextField = resultTextField.getText();		
		
						getResultNum();
						lastOperator =e.getActionCommand();
						
						setTextField(lastOperator);
					
				}
			});
			
		
			private void getResultNum() {
				try {
				resultFieldNumber = Integer.parseInt(getResultTextField);
				}catch (NumberFormatException e2) {
				resultFieldNumber = 0;
				}
			}
			
		
			private void setTextField(String operate) {
					eqaulCalculate(operate);
						if(! operate.equals("=")) {
							textField.setText(getTextField+lastOperator);
							lastNumber ="";
							operator = operate;
						}
					resultTextField.setText(Integer.toString(cal));
			}	
			

			

		
			private void calculator(String operate) {
					switch (operate) {
					case "+":
						this.cal = resultFieldNumber + convertInt(lastNumber);
						break;
					case "-":
						this.cal = resultFieldNumber - convertInt(lastNumber);
						break;
					case "x":
						this.cal = resultFieldNumber * convertInt(lastNumber);
						break;
					case "/":
						try {
						this.cal = resultFieldNumber / convertInt(lastNumber);
						}catch(ArithmeticException e2) {
							textField.setText("0 �Է��Ͻø� No.");
							lastNumber="";
							lastOperator="";
							cal=0;
							System.out.println("exception");
						}
						break;	
					default : 
						operator=operate;
						break;
					}
			}
			
			
			
			private void eqaulCalculate(String operate) {
				if(resultFieldNumber !=  0 ) {
					if(operate.equals("=")) { 
						calculator(operator);
						resultNumber = cal;
					}else {
						cal=resultNumber;
					}
				}else {
					this.cal =Integer.parseInt(lastNumber); 
					operator=operate;
				}
			}
			
		
			private int convertInt(String msg) {
				this.convertNumber = Integer.parseInt(msg);
				return convertNumber;
			}
			
			 

			
			private void setTextFiled(String text) {
				tempNumber = convertInt(text);
				textField.setText(textField.getText()+text);
			}
			
			private void setResultTextFiled(String text) {
				resultNumber = convertInt(text);
				resultTextField.setText(text);
			}
			
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorBackup frame = new CalculatorBackup();
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
	public CalculatorBackup() {
		setTitle("\uACC4\uC0B0\uAE30");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 271, 407);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button_x = new JButton("x");
		button_x.setBounds(183, 236, 58, 39);
		contentPane.add(button_x);
		button_x.addActionListener(calNumber);
		
		JButton button_4 = new JButton("4");
		button_4.setBounds(12, 236, 58, 39);
		contentPane.add(button_4);
		button_4.addActionListener(clickButton);
		
		JButton button_5 = new JButton("5");
		button_5.setBounds(69, 236, 58, 39);
		contentPane.add(button_5);
		button_5.addActionListener(clickButton);
		
		JButton button_6 = new JButton("6");
		button_6.setBounds(126, 236, 58, 39);
		contentPane.add(button_6);
		button_6.addActionListener(clickButton);
		
		
		JButton button_1 = new JButton("1");
		button_1.setBounds(12, 277, 58, 39);
		contentPane.add(button_1);
		button_1.addActionListener(clickButton);
		
		JButton button_2 = new JButton("2");
		button_2.setBounds(69, 277, 58, 39);
		contentPane.add(button_2);
		button_2.addActionListener(clickButton);
		
		JButton button_3 = new JButton("3");
		button_3.setBounds(126, 277, 58, 39);
		contentPane.add(button_3);
		button_3.addActionListener(clickButton);
		
		JButton button_10 = new JButton("-");
		button_10.setBounds(183, 277, 58, 39);
		contentPane.add(button_10);
		button_10.addActionListener(calNumber);
		
		JButton button_eq = new JButton("=");
		button_eq.setBounds(12, 318, 58, 39);
		contentPane.add(button_eq);
		button_eq.addActionListener(calNumber);
		
		JButton button_0 = new JButton("0");
		button_0.addActionListener(clickButton);
		button_0.setBounds(69, 318, 58, 39);
		contentPane.add(button_0);
		
		JButton button_13 = new JButton(".");
		button_13.setBounds(126, 318, 58, 39);
		contentPane.add(button_13);
		
		JButton button_14 = new JButton("+");
		button_14.setBounds(183, 318, 58, 39);
		contentPane.add(button_14);
		button_14.addActionListener(calNumber);
		
		JButton button_15 = new JButton("<-");
		button_15.setBounds(183, 155, 58, 39);
		contentPane.add(button_15);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(126, 155, 58, 39);
		contentPane.add(btnC);
		btnC.addActionListener(clearButton);
		
		JButton btnCe = new JButton("CE");
		btnCe.setBounds(69, 155, 58, 39);
		contentPane.add(btnCe);
		
		JButton button_18 = new JButton("%");
		button_18.setBounds(12, 155, 58, 39);
		contentPane.add(button_18);
		button_18.addActionListener(calNumber);
		
		textField = new JTextField();
		textField.setFont(new Font("����", Font.PLAIN, 20));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(13, 34, 226, 85);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button_7 = new JButton("7");
		button_7.setBounds(12, 195, 58, 39);
		contentPane.add(button_7);
		button_7.addActionListener(clickButton);

		JButton button_8 = new JButton("8");
		button_8.setBounds(69, 195, 58, 39);
		contentPane.add(button_8);
		button_8.addActionListener(clickButton);
		
		JButton button_9 = new JButton("9");
		button_9.setBounds(126, 195, 58, 39);
		contentPane.add(button_9);
		button_9.addActionListener(clickButton);
		
		JButton button_16 = new JButton("/");
		button_16.setBounds(183, 195, 58, 39);
		contentPane.add(button_16);
		button_16.addActionListener(calNumber);
		
		resultTextField = new JTextField();
		resultTextField.setBounds(12, 123, 229, 28);
		contentPane.add(resultTextField);
		resultTextField.setColumns(10);
	}
}
