package simpleCalculator;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ElementLayout {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel("Label");
	
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
		panel.setLayout(new GridBagLayout());
		GridBagConstraints loc = new GridBagConstraints();
	
		// Top row: calculation window
		loc.gridx = 0;
		loc.gridy = 0;
		panel.add(label,loc);
		
		// Second row:  buttons 9-7
		loc.gridx = 2;
		loc.gridy = 1;
		panel.add(btn9,loc);
		
		loc.gridx = 1;
		loc.gridy = 1;
		panel.add(btn8,loc);
		
		loc.gridx = 0;
		loc.gridy = 1;
		panel.add(btn7,loc);
		
		// Third row: buttons 9-7
		loc.gridx = 
		panel.add(btn6);
		panel.add(btn5);
		
		loc.gridx = 0;
		loc.gridx
		panel.add(btn4);
		panel.add(btn3);
		panel.add(btn2);
		panel.add(btn1);
		panel.add(btn0);
		panel.add(btnMult);
		panel.add(btnDiv);
		panel.add(btnAdd);
		panel.add(btnSub);
		panel.add(btnEqu);
		panel.add(btnClear);
		panel.add(btnDot);
		
		frame.add(panel);
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setSize(500,300);
		frame.setVisible(true);
		frame.setResizable(true);
		
		
		
		
	}
	

}
