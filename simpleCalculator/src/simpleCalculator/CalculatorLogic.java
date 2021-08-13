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
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String action = e.getActionCommand();
		
		
		switch (action) {
			case "1":
				element.setTextField("1");
			default:
		}
	}

}
