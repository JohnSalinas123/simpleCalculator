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
	
	// find operation symbol, if it exists then replace with new operation symbol
	public boolean checkforOperation(char opSym) {
		int marker = 0;
		boolean operateFound = false;
		String word = element.getTextField();
		char[] charArray = word.toCharArray();
		
		for (int i = 0; i < element.getTextFieldLength(); i++) {
			if (charArray[i] == 'x' || charArray[i] == '/' || charArray[i] == '+' || charArray[i] == '-' && i != 0) {
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
	
	// calculate resulting value when user clicks = operation
	public boolean calculate() {
		int marker = 0;
		boolean foundOp = false;
		String word = element.getTextField();
		char[] charArray = word.toCharArray();
		char[] left =  new char[10];
		char[] right = new char[10];
		
		// To-do: get location of operation symbol in text field, if there is none exit method
		for (int i = 0; i < element.getTextFieldLength(); i++) {
			if (charArray[i] == 'x' || charArray[i] == '/' || charArray[i] == '+' || charArray[i] == '-' && i != 0) {
					foundOp = true;
					break;

			}
			marker++;
		}
		System.out.println(element.getTextFieldLength());
		System.out.println(marker);
		
		if (foundOp == false) {
			return false;
		}
		
		// To-do: get left side of operation as int/float
		for (int i = 0; i < marker; i++) {
			if (charArray[i] == 'x' || charArray[i] == '/' || charArray[i] == '+' || charArray[i] == '-' && i != 0) {
				break;
			} else {
				left[i] = charArray[i];
			}
		}
		String leftNum = String.valueOf(left);
		System.out.println(leftNum);
		
		// To-do: get right side of operation as int/float
		int count = 0;
		for (int i = marker + 1; i < element.getTextFieldLength(); i++) {
			right[count] = charArray[i];
			count++;
			//System.out.println(charArray[i]);
			
		}
		String rightNum = String.valueOf(right);
		System.out.println(rightNum);
		
		// To-do: make final calculations and send value to text field
		
		float result = 0;
		float leftFloat = Float.parseFloat(leftNum);
		float rightFloat = Float.parseFloat(rightNum);
		if (charArray[marker] == 'x') {
			result = leftFloat*rightFloat;
		} 
		else if (charArray[marker] == '/') {
			result = leftFloat/rightFloat;
		} 
		else if (charArray[marker] == '+') {
			result = leftFloat + rightFloat;
		} else  {
			result = leftFloat - rightFloat;
		}
		 
		String resultStr = String.valueOf(result);
		System.out.println(resultStr);
		element.setTextField(resultStr, true);
		
		return true;
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
				
				calculate();
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
