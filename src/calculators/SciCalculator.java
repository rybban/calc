package calculators;

import java.awt.event.ActionEvent;

import interfaces.CalculatorAdvancedOperations;

public class SciCalculator extends Calculator implements CalculatorAdvancedOperations {

	SciCalculatorGUI sc;
	public SciCalculator() {
		sc = (SciCalculatorGUI) super.g;
		
		sc.cosb.addActionListener(this);
		sc.coshb.addActionListener(this);
		sc.tanb.addActionListener(this);
		sc.tanhb.addActionListener(this);
		sc.sinb.addActionListener(this);
		sc.sinhb.addActionListener(this);
		sc.x2b.addActionListener(this);
		sc.x3b.addActionListener(this);
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == sc.cosb ||
				e.getSource() == sc.coshb ||
				e.getSource() == sc.sinb ||
				e.getSource() == sc.sinhb ||
				e.getSource() == sc.tanb ||
				e.getSource() == sc.tanhb ||
				e.getSource() == sc.cosb )
			System.out.println("HIII");
		super.actionPerformed(e);
	}

}
