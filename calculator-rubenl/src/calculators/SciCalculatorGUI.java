package calculators;

import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.text.AttributedString;
import java.awt.event.ActionEvent;
import java.awt.Insets;

public class SciCalculatorGUI extends CalculatorGUI {
	JPanel jp;
	
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public SciCalculatorGUI() {
		
		jp = new JPanel();
		super.jf.getContentPane().add(jp);
		GridBagLayout gbl_jp = new GridBagLayout();
		gbl_jp.columnWidths = new int[]{0, 0, 0, 0, 0, 38, 0, 0, 0};
		gbl_jp.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_jp.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_jp.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		jp.setLayout(gbl_jp);
		
		String xraised = new String("x");
		
		
		JButton btnNewButton = new JButton("10" + "\u207F");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 5;
		gbc_btnNewButton.gridy = 5;
		jp.add(btnNewButton, gbc_btnNewButton);
		super.jf.setSize(super.jf.getWidth()+400, super.jf.getHeight());
		
		
	}
	

	public void entry() {
		
	}
}
