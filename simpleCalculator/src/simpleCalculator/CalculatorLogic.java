package simpleCalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class CalculatorLogic implements ActionListener {
	
	ElementLayout element;
	
	public CalculatorLogic(ElementLayout element) {
		this.element = element;
	}
	
	public boolean checkforOperation(char opSym) {
		int marker = 0;
		boolean operateFound = false;
		String word = element.getTextField();
		char[] charArray = word.toCharArray();
		
		for (int i = 0; i < element.getTextFieldLength(); i++) {
			if (charArray[i] == 'x' || charArray[i] == '/' || charArray[i] == '+' || charArray[i] == '-') {
				operateFound = true;
				break;
			}
			marker++;
		}
		
		if (operateFound) {
			element.setSpecTextField(marker, opSym);
		}
		
		return operateFound;
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String action = e.getActionCommand();
		
		
		switch (action) {
			case "1":
				element.setTextField("1");
				break;
			case "2":
				element.setTextField("2");
				break;
			case "3":
				element.setTextField("3");
				break;
			case "4":
				element.setTextField("4");
				break;
			case "5":
				element.setTextField("5");
				break;
			case "6":
				element.setTextField("6");
				break;
			case "7":
				element.setTextField("7");
				break;
			case "8":
				element.setTextField("8");
				break;
			case "9":
				element.setTextField("9");
				break;
			case "0":
				element.setTextField("0");
				break;
			case "x":
				if (checkforOperation('x')) {
					break;
				} else {
					element.setTextField("x");
					break;
				}
			case "/":
				if (checkforOperation('/')) {
					break;
				} else {
					element.setTextField("/");
					break;
				}
			case "+":
				if (checkforOperation('+')) {
					break;
				} else {
					element.setTextField("+");
					break;
				}
			case "-":
				if (checkforOperation('-')) {
					break;
				} else {
					element.setTextField("-");
					break;
				}
			case "=":
				// To-do: make method for reading text field correctly and making final calculations
				
				break;
			case "AC":
				element.setTextField("AC");
				break;
			case ".":
				element.setTextField(".");
				break;
			default:
				System.out.println("Something went wrong!");
				break;
		}
		
	}

}
