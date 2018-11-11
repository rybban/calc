package calculators;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import interfaces.CalculatorBasicOperations;

public class Calculator implements ActionListener, CalculatorBasicOperations {
	
	int lastOperatorSize;
	//ArrayList<int> numbers = new ArrayList();
	
	
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
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == g.oneb)
			g.textf.setText(g.textf.getText()+"1");
		else if (e.getSource() == g.twob)
			g.textf.setText(g.textf.getText()+"2");
		else if (e.getSource() == g.threeb)
			g.textf.setText(g.textf.getText()+"3");
		else if (e.getSource() == g.fourb)
			g.textf.setText(g.textf.getText()+"4");
		else if (e.getSource() == g.fiveb)
			g.textf.setText(g.textf.getText()+"5");
		else if (e.getSource() == g.sixb)
			g.textf.setText(g.textf.getText()+"6");
		else if (e.getSource() == g.sevenb)
			g.textf.setText(g.textf.getText()+"7");
		else if (e.getSource() == g.eightb)
			g.textf.setText(g.textf.getText()+"8");
		else if (e.getSource() == g.nineb)
			g.textf.setText(g.textf.getText()+"9");
		else if (e.getSource() == g.zerob)
			g.textf.setText(g.textf.getText()+"0");
		else if (e.getSource() == g.plusb)
			g.textf.setText(g.textf.getText()+"+");
		else if (e.getSource() == g.minusb)
			g.textf.setText(g.textf.getText()+"-");
		else if (e.getSource() == g.divideb)
			g.textf.setText(g.textf.getText()+"/");
		else if (e.getSource() == g.multiplyb)
			g.textf.setText(g.textf.getText()+"*");
		else if (e.getSource() == g.equalsb)
			g.textf.setText(""+equals(g.textf.getText()));
		
		
	}
	
	@Override
	public double equals(String total) {
		double count;
		
				
		
		
		
		return 0;
	}
	
	@Override
	public double add(double number1, double number2) {
		return number1+number2;
	}

	@Override
	public double subtract(double number1, double number2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double divide(double number1, double number2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double multiply(double number1, double number2) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
