package calculators;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.text.BadLocationException;

import interfaces.CalculatorBasicOperations;

public class Calculator implements ActionListener, CalculatorBasicOperations {
	
	int fullStringSize = 0;
	int previousEntrySize = 0;
	int currentEntryNumber = 0;
	String currentString = "";
	String totalString = "";
	ArrayList<String> entries = new ArrayList();
	boolean recentOperator = false;
	boolean recentEquals = false;
	
	
	double total;
	CalculatorGUI g;
	public Calculator(int type) {
		if (type == 1) {
			g = new CalculatorGUI();
			
		}
		else if (type == 2) {
			g = new SciCalculatorGUI();
		}
		g.oneb.addActionListener(this);
		g.twob.addActionListener(this);
		g.threeb.addActionListener(this);
		g.fourb.addActionListener(this);
		g.fiveb.addActionListener(this);
		g.sixb.addActionListener(this);
		g.sevenb.addActionListener(this);
		g.eightb.addActionListener(this);
		g.nineb.addActionListener(this);
		g.zerob.addActionListener(this);
		g.plusb.addActionListener(this);
		g.minusb.addActionListener(this);
		g.divideb.addActionListener(this);
		g.multiplyb.addActionListener(this);
		g.equalsb.addActionListener(this);
		g.backb.addActionListener(this);
		g.commab.addActionListener(this);
		g.clearb.addActionListener(this);
		g.clearentryb.addActionListener(this);
		g.squarerootb.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if ((e.getSource() == g.oneb ||
				e.getSource() == g.twob ||
				e.getSource() == g.threeb ||
				e.getSource() == g.fourb ||
				e.getSource() == g.fiveb ||
				e.getSource() == g.sixb ||
				e.getSource() == g.sevenb ||
				e.getSource() == g.eightb ||
				e.getSource() == g.nineb ||
				e.getSource() == g.zerob ||
				e.getSource() == g.commab) && !recentEquals) {
			currentString += ((AbstractButton) e.getSource()).getText();
			totalString += ((AbstractButton) e.getSource()).getText();
			g.textf.setText(totalString);
				previousEntrySize++;
			if (entries.isEmpty())
				entries.add(currentString);
			else if (recentOperator || recentEquals) {
				currentEntryNumber += 1;
				entries.add(currentString);
			}
			else
				entries.set(currentEntryNumber, currentString);
		}
		
		else if (e.getSource() == g.backb && !entries.isEmpty()) {
			String s = entries.get(currentEntryNumber);
			if (entries.get(entries.size()-1).length() > 1) {
				
				if (s.equals("sqrt")){
					entries.remove(entries.size()-1);
					currentEntryNumber--;
				}
				else if (s.substring(s.length()-2, s.length()-1).equals(".")) {
					entries.set(currentEntryNumber, s.substring(0, s.length()-2));
					totalString = totalString.substring(0, totalString.length()-2);
					currentString = entries.get(currentEntryNumber);
				}
				else {
					entries.set(currentEntryNumber, s.substring(0, s.length()-1));
					totalString = totalString.substring(0, totalString.length()-1);
				}
				previousEntrySize--;
				
				
			}
			else if (!entries.isEmpty() ) {
				entries.remove(entries.size()-1);
				totalString = totalString.substring(0, totalString.length()-1);
				currentEntryNumber--;
			}
			
			
			g.textf.setText(totalString);
			
			/*try {
				g.textf.setText(g.textf.getText(0, g.textf.getText().length()-1));
			} catch (BadLocationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}*/
		}
		else if (e.getSource() == g.clearb){
			entries.removeAll(entries);
			g.textf.setText("");
			previousEntrySize = 0;
			currentString = "";
			totalString = "";
		}
		
		else if(!recentOperator && e.getSource() == g.squarerootb) {
			currentString = ((AbstractButton) e.getSource()).getText();
			totalString += currentString;
			currentString = "sqrt";
			g.textf.setText(totalString);
			currentEntryNumber++;
			entries.add(currentString);
			currentString = "";
			this.previousEntrySize = 0;
			this.recentOperator = true;
		}
		
		else if (recentOperator == false && e.getSource() != g.equalsb && previousEntrySize > 0){
			fullStringSize = g.textf.getText().length();
			if (e.getSource() == g.plusb ||
					e.getSource() == g.minusb ||
					e.getSource() == g.divideb ||
					e.getSource() == g.multiplyb) {
				currentEntryNumber += 1;
				currentString = ((AbstractButton) e.getSource()).getText();
				totalString += currentString;
				g.textf.setText(totalString);

				entries.add(currentString);
				currentString = "";
				this.previousEntrySize = 0;
			}
			
			
			
			fullStringSize = g.textf.getText().length();
			
			this.recentOperator = true;
		}
		
		
		if (previousEntrySize > 0) {
			recentOperator = false;
		}
		
		if (recentOperator) {
			
			recentEquals = false;
		}
		
		if (e.getSource() == g.equalsb && recentOperator == false && entries.size() >= 2 && previousEntrySize != 0) {
			equals(g.textf.getText());
		}
		
		
		
		if (entries.isEmpty()) {
			totalString = "";
			currentString = "";
			previousEntrySize = 0;
			currentEntryNumber = 0;
			recentEquals = false;
			recentOperator = false;
		}
		
		g.textf.setText(totalString);
		System.out.println(previousEntrySize + " " + currentEntryNumber + " " + entries.toString());
		
		
	
	}
	
	public void addStringFromTextField(String s) {
		String workingString = "";
		char[] ca = s.toCharArray();
		for (char c : ca) {
			if (c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9' || c == '0' || c == '.') {
				workingString += c;
			}
			else if (c == '+' || c == '-' || c == '/' || c == '*' ) {
				entries.add(workingString);
				workingString = ""+c;
				entries.add(workingString);
				workingString = "";
			}	
		}
		//entries.add(workingString);
	}
	
	
	@Override
	public double equals(String total) {
		double count = 0;
		double totall = 0;
		fullStringSize = g.textf.getText().length();

		System.out.println(entries.toString());
		
		
		
		for (int i = 0; i < entries.size(); i++) {
			if (entries.get(i).equals("*")){
				count = multiply(Double.parseDouble(entries.get(i-1)), Double.parseDouble(entries.get(i+1)));
				entries.set(i, "" + count);
				entries.remove(i+1);
				entries.remove(i-1);

				i--;
				
				totall = count;
				System.out.println(entries.toString()  + totall);
			}
			if (entries.get(i).equals("/")){
				count = divide(Double.parseDouble(entries.get(i-1)), Double.parseDouble(entries.get(i+1)));
				entries.set(i, "" + count);
				entries.remove(i+1);
				entries.remove(i-1);
				
				i--;
				totall = count;
				System.out.println(entries.toString()  + totall);
			}
		}
		
		for (int i = 0; i < entries.size(); i++) {
			if (entries.get(i).equals("+")){
				count = add(Double.parseDouble(entries.get(i-1)), Double.parseDouble(entries.get(i+1)));
				entries.set(i, "" + count);
				
				entries.remove(i+1);
				entries.remove(i-1);
				i--;
				totall = count;
				System.out.println(entries.toString() + totall);
			}
			if (entries.get(i).equals("-")){
				count = subtract(Double.parseDouble(entries.get(i-1)), Double.parseDouble(entries.get(i+1)));
				entries.set(i, "" + count);
				entries.remove(i+1);
				entries.remove(i-1);
				
				i--;
				totall = count;
				System.out.println(entries.toString()  + totall);
			}
		}
		
		for (int i = 0; i < entries.size(); i++){
			if (entries.size() > 1)
				entries.remove(i);
		}
		previousEntrySize = entries.get(0).length();
		
		totalString = "" + totall;
		g.textf.setText(totalString);
		recentEquals = true;
		currentEntryNumber = 0;
		return 0;
	}
	
	@Override
	public double add(double number1, double number2) {
		return number1+number2;
	}

	@Override
	public double subtract(double number1, double number2) {
		return number1-number2;
	}

	@Override
	public double divide(double number1, double number2) {
		return number1/number2;
	}

	@Override
	public double multiply(double number1, double number2) {
		return number1*number2;
	}

	@Override
	public double squareroot(double number1) {
		return Math.sqrt(number1);
	}

	
}
