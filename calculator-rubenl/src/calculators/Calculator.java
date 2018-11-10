package calculators;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
	CalculatorGUI g;
	public Calculator(int type) {
		if (type == 1) {
			g = new CalculatorGUI();
			
		}
		else if (type == 2) {
			g = new SciCalculatorGUI();
		}
		g.oneb.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == g.oneb)
			g.textf.setText(g.textf.getText()+"1");
		
	}

}
