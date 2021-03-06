package simpleCalculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class ElementLayout {
	JFrame frame = new JFrame("Simple name change");
	JPanel panel = new JPanel();
	JLabel label = new JLabel("Label testing testing");
	JTextField text = new JTextField("0");
	
	CalculatorLogic logic;
	
	JButton btn9 = new JButton("9");
	JButton btn8 = new JButton("8");
	JButton btn7 = new JButton("7");
	JButton btn6 = new JButton("6");
	JButton btn5 = new JButton("5");
	JButton btn4 = new JButton("4");
	JButton btn3 = new JButton("3");
	JButton btn2 = new JButton("2");
	JButton btn1 = new JButton("1");
	JButton btn0 = new JButton("0");
	
	JButton btnMult = new JButton("x");
	JButton btnDiv = new JButton("/");
	JButton btnAdd = new JButton("+");
	JButton btnSub = new JButton("-");
	JButton btnEqu = new JButton("=");
	JButton btnClear = new JButton("AC");
	JButton btnDot = new JButton(".");  
	
	public ElementLayout() {
		CalculatorLogic c = new CalculatorLogic(this);
		btn1.addActionListener(c);
		btn2.addActionListener(c);
		btn3.addActionListener(c);
		btn4.addActionListener(c);
		btn5.addActionListener(c);
		btn6.addActionListener(c);
		btn7.addActionListener(c);
		btn8.addActionListener(c);
		btn9.addActionListener(c);
		btn0.addActionListener(c);
		
		btnMult.addActionListener(c);
		btnDiv.addActionListener(c);
		btnAdd.addActionListener(c);
		btnSub.addActionListener(c);
		btnEqu.addActionListener(c);
		btnClear.addActionListener(c);
		btnDot.addActionListener(c);
		
		Border box = BorderFactory.createLineBorder(Color.black,1);
		label.setBorder(box);
		
		Font font = new Font("SansSerif", Font.BOLD, 25);
		text.setFont(font);
		text.setHorizontalAlignment(JTextField.RIGHT);
		text.setEditable(false);
		text.setPreferredSize(new Dimension(GridBagConstraints.HORIZONTAL,60));
		text.setBorder(box);
		
		Dimension size = new Dimension(80,50);
		btn1.setPreferredSize(size);
		btn2.setPreferredSize(size);
		btn3.setPreferredSize(size);
		btn4.setPreferredSize(size);
		btn5.setPreferredSize(size);
		btn6.setPreferredSize(size);
		btn7.setPreferredSize(size);
		btn8.setPreferredSize(size);
		btn9.setPreferredSize(size);
		btn0.setPreferredSize(size);
		
		btnMult.setPreferredSize(size);
		btnAdd.setPreferredSize(size);
		btnSub.setPreferredSize(size);
	    btnDiv.setPreferredSize(size);
		btnClear.setPreferredSize(size);
		btnEqu.setPreferredSize(size);
		btnDot.setPreferredSize(size);
	
		
		panel.setLayout(new GridBagLayout());
		
		
		GridBagConstraints loc = new GridBagConstraints();
		loc.fill = GridBagConstraints.HORIZONTAL;
		loc.insets = new Insets(2,2,2,2);
	
		// Top row: calculation window
		loc.gridwidth = 4;
		loc.gridx = 0;
		loc.gridy = 0;
		panel.add(text,loc);
		
		loc.gridwidth = 1;
		// Second row:  buttons 7-9 and multiply
		loc.gridx = 2;
		loc.gridy = 1;
		panel.add(btn9,loc);
		
		loc.gridx = 1;
		loc.gridy = 1;
		panel.add(btn8,loc);
		
		loc.gridx = 0;
		loc.gridy = 1;
		panel.add(btn7,loc);
		
		loc.gridx = 3;
		loc.gridy = 1;
		panel.add(btnMult,loc);
		// Third row: buttons 4-6 and divide
		loc.gridx = 2;
		loc.gridy = 2;
		panel.add(btn6,loc);
		
		loc.gridx = 1;
		loc.gridy = 2;
		panel.add(btn5,loc);
		
		loc.gridx = 0;
		loc.gridy = 2;
		panel.add(btn4,loc);
		
		loc.gridx = 3;
		loc.gridy = 2;
		panel.add(btnDiv,loc);
		
		// Fourth row: buttons 1-3 and add
		loc.gridx = 2;
		loc.gridy = 3;
		panel.add(btn3,loc);
		
		loc.gridx = 1;
		loc.gridy = 3;
		panel.add(btn2,loc);
		
		loc.gridx = 0;
		loc.gridy = 3;
		panel.add(btn1,loc);
		
		loc.gridx = 3;
		loc.gridy = 3;
		panel.add(btnAdd,loc);
	
		// Fifth row: buttons 0, dot, clear, sub
		loc.gridx = 0;
		loc.gridy = 4;
		panel.add(btn0,loc);
		
		loc.gridx = 1;
		loc.gridy = 4;
		panel.add(btnDot,loc);
		
		loc.gridx = 2;
		loc.gridy = 4;
		panel.add(btnClear,loc);
		
		loc.gridx = 3;
		loc.gridy = 4;
		panel.add(btnSub,loc);
		
		// Bottom row: equal
		loc.gridwidth = 4;
		loc.gridx = 0;
		loc.gridy = 5;
		panel.add(btnEqu,loc);
		
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setSize(400,450);
		frame.setVisible(true);
		frame.setResizable(false);
		
		
		
		
	}
	
	public void setTextField(String symbol) {
		// To-do: make method that reads text field and checks if their is an operation symbol already
	
		String field = text.getText();
		if (field.equals("0") && symbol != "AC" && symbol != "x" && symbol != "/" && symbol != "+" && symbol != "-" && symbol != ".") {
			text.setText(symbol);
		}
		else if (symbol == "AC") {
			text.setText("0");
		}
		else if (field.equals("0") == false){
			text.setText(text.getText() + symbol);
		}
		
	}
	
	public void setTextField(String result, boolean calcSwitch) {
		text.setText(result);	
	}
	
	// Replace specific letter in text field with a certain char
	public void setSpecTextField(int num, char letter) {
		String word = text.getText();
		char[] charArray = word.toCharArray();
		
		charArray[num] = letter;
		String replacedOp = String.valueOf(charArray);
		text.setText(replacedOp);
		
	}
	
	// Get the length of the text field
	public int getTextFieldLength() {
		String field = text.getText();
		return field.length();
	}
	
	// return the string in text field
	public String getTextField() {
		String field = text.getText();
		return field;
	}
	

}
