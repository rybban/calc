package calculators;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.text.BadLocationException;

import interfaces.CalculatorBasicOperations;

public class Calculator implements ActionListener, CalculatorBasicOperations {
	
	int fullStringSize = 0;
	int previousEntrySize = 0;
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
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		if (e.getSource() == g.oneb) {
			g.textf.setText(g.textf.getText()+"1");
			previousEntrySize++;
		}
		else if (e.getSource() == g.twob) {
			g.textf.setText(g.textf.getText()+"2");
			previousEntrySize++;
		}
		else if (e.getSource() == g.threeb) {
			g.textf.setText(g.textf.getText()+"3");
			previousEntrySize++;
		}
		else if (e.getSource() == g.fourb) {
			g.textf.setText(g.textf.getText()+"4");
			previousEntrySize++;
		}
		else if (e.getSource() == g.fiveb) {
			g.textf.setText(g.textf.getText()+"5");
			previousEntrySize++;
		}
		else if (e.getSource() == g.sixb) {
			g.textf.setText(g.textf.getText()+"6");
			previousEntrySize++;
		}
		else if (e.getSource() == g.sevenb) {
			g.textf.setText(g.textf.getText()+"7");
			previousEntrySize++;
		}
		else if (e.getSource() == g.eightb) {
			g.textf.setText(g.textf.getText()+"8");
			previousEntrySize++;
		}
		else if (e.getSource() == g.nineb) {
			g.textf.setText(g.textf.getText()+"9");
			previousEntrySize++;
		}
		else if (e.getSource() == g.zerob) {
			g.textf.setText(g.textf.getText()+"0");
			previousEntrySize++;
		}
		else if (e.getSource() == g.commab){
			g.textf.setText(g.textf.getText()+".");
			previousEntrySize++;
		}
		else if (e.getSource() == g.backb && !g.textf.getText().equals("")) {
			previousEntrySize--;
			try {
				g.textf.setText(g.textf.getText(0, g.textf.getText().length()-1));
			} catch (BadLocationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else if (e.getSource() == g.clearb){
			entries.removeAll(entries);
			g.textf.setText("");
		}
		
		
		
		else if (recentOperator == false && e.getSource() != g.equalsb){
			fullStringSize = g.textf.getText().length();
			if (!recentEquals && previousEntrySize > 0){	
				try {
					entries.add(g.textf.getText(fullStringSize-previousEntrySize, previousEntrySize));
				} catch (BadLocationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if (e.getSource() == g.plusb)
				g.textf.setText(g.textf.getText()+"+");
			else if (e.getSource() == g.minusb)
				g.textf.setText(g.textf.getText()+"-");
			else if (e.getSource() == g.divideb)
				g.textf.setText(g.textf.getText()+"/");
			else if (e.getSource() == g.multiplyb)
				g.textf.setText(g.textf.getText()+"*");
			
			fullStringSize = g.textf.getText().length();
			
				try {
					entries.add(g.textf.getText(fullStringSize-1, 1));
				} catch (BadLocationException e1) {
					System.out.println(fullStringSize+ " " +previousEntrySize);
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			this.previousEntrySize = 0;
			this.recentOperator = true;
		}
		
		
		if (previousEntrySize > 0) {
			recentOperator = false;
		}
		
		if (recentEquals && previousEntrySize > 0) {
			
			recentEquals = false;
		}
		
		if (e.getSource() == g.equalsb && recentOperator == false && entries.size() >= 2 && previousEntrySize != 0) {
			equals(g.textf.getText());
		}
		
		System.out.println(previousEntrySize + " " + fullStringSize + " " + entries.toString());
		
		
	}
	
	@Override
	public double equals(String total) {
		double count = 0;
		double totall = 0;
		fullStringSize = g.textf.getText().length();
		try {
			entries.add(g.textf.getText(fullStringSize-previousEntrySize, previousEntrySize));
		} catch (BadLocationException e1) {
			System.out.println(fullStringSize+ " " +previousEntrySize);
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
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
		g.textf.setText("" + totall);
		recentEquals = true;
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

	
}
