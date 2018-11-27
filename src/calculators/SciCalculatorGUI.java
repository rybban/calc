package calculators;

import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.text.AttributedString;
import java.awt.event.ActionEvent;
import java.awt.Insets;
import javax.swing.UIManager;
import java.awt.Point;
import java.awt.Button;
import javax.swing.JRadioButton;

public class SciCalculatorGUI extends CalculatorGUI {
	JPanel jp;
	JFrame scijf;
	JRadioButton radioButton;
	JRadioButton radioButton_1;
	 JRadioButton radioButton_2;
	JButton invb;
	 JButton lnb;
	 JButton leftparb;
	 JButton rightparb;
	 JButton intb;
	 JButton sinhb;
	 JButton sinb;
	 JButton x2b;
	 JButton nib;
	 JButton dmsb;
	 JButton coshb;
	 JButton cosb;
	 JButton xtopowyb;
	 JButton yrootxb;
	 JButton pib;
	 JButton tanhb;
	 JButton tanb;
	 JButton x3b;
	 JButton thirdrootxb;
	 JButton feb;
	 JButton expb;
	 JButton modb;
	 JButton logb;
	 JButton tentopownb;
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public SciCalculatorGUI() {
		
		super.jf.setSize(425, 391);

		super.jf.getContentPane().setLayout(new BorderLayout());
		
		
		super.jf.setSize(super.jf.getWidth()+350, super.jf.getHeight());
		super.jf.getContentPane().setSize(super.jf.getContentPane().getWidth()+400, super.jf.getContentPane().getHeight());
		
		jp = new JPanel();
		
		super.jf.getContentPane().setLocation(400, 0);
		super.jf.getContentPane().add(jp, BorderLayout.EAST);
		
		
		
		GridBagLayout gbl_jp = new GridBagLayout();
		gbl_jp.columnWidths = new int[] {75, 75, 75, 75, 75};
		gbl_jp.rowHeights = new int[] {60, 60, 60, 60, 60, 60};
		gbl_jp.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0};
		gbl_jp.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		jp.setLayout(gbl_jp);
		
		String xraised = new String("x");
		
		ButtonGroup bg = new ButtonGroup();
		
		radioButton = new JRadioButton("1");
		GridBagConstraints gbc_radioButton = new GridBagConstraints();
		gbc_radioButton.insets = new Insets(0, 0, 5, 5);
		gbc_radioButton.gridx = 0;
		gbc_radioButton.gridy = 0;
		jp.add(radioButton, gbc_radioButton);
		bg.add(radioButton);
		
		radioButton_1 = new JRadioButton("2");
		GridBagConstraints gbc_radioButton_1 = new GridBagConstraints();
		gbc_radioButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_radioButton_1.gridx = 1;
		gbc_radioButton_1.gridy = 0;
		jp.add(radioButton_1, gbc_radioButton_1);
		bg.add(radioButton_1);
		
		radioButton_2 = new JRadioButton("3");
		GridBagConstraints gbc_radioButton_2 = new GridBagConstraints();
		gbc_radioButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_radioButton_2.gridx = 2;
		gbc_radioButton_2.gridy = 0;
		jp.add(radioButton_2, gbc_radioButton_2);
		bg.add(radioButton_2);
		
		
		
		invb = new JButton("Inv");
		invb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_invb = new GridBagConstraints();
		gbc_invb.fill = GridBagConstraints.BOTH;
		gbc_invb.insets = new Insets(0, 0, 5, 5);
		gbc_invb.gridx = 1;
		gbc_invb.gridy = 1;
		jp.add(invb, gbc_invb);
		
		lnb = new JButton("ln");
		lnb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lnb = new GridBagConstraints();
		gbc_lnb.fill = GridBagConstraints.BOTH;
		gbc_lnb.insets = new Insets(0, 0, 5, 5);
		gbc_lnb.gridx = 2;
		gbc_lnb.gridy = 1;
		jp.add(lnb, gbc_lnb);
		
		leftparb = new JButton("(");
		leftparb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_leftparb = new GridBagConstraints();
		gbc_leftparb.fill = GridBagConstraints.BOTH;
		gbc_leftparb.insets = new Insets(0, 0, 5, 5);
		gbc_leftparb.gridx = 3;
		gbc_leftparb.gridy = 1;
		jp.add(leftparb, gbc_leftparb);
		
		rightparb = new JButton(")");
		rightparb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_rightparb = new GridBagConstraints();
		gbc_rightparb.fill = GridBagConstraints.BOTH;
		gbc_rightparb.insets = new Insets(0, 0, 5, 5);
		gbc_rightparb.gridx = 4;
		gbc_rightparb.gridy = 1;
		jp.add(rightparb, gbc_rightparb);
		
		intb = new JButton("Int");
		intb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_intb = new GridBagConstraints();
		gbc_intb.fill = GridBagConstraints.BOTH;
		gbc_intb.insets = new Insets(0, 0, 5, 5);
		gbc_intb.gridx = 0;
		gbc_intb.gridy = 2;
		jp.add(intb, gbc_intb);
		
		sinhb = new JButton("sinh");
		sinhb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_sinhb = new GridBagConstraints();
		gbc_sinhb.fill = GridBagConstraints.BOTH;
		gbc_sinhb.insets = new Insets(0, 0, 5, 5);
		gbc_sinhb.gridx = 1;
		gbc_sinhb.gridy = 2;
		jp.add(sinhb, gbc_sinhb);
		
		sinb = new JButton("sin");
		sinb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_sinb = new GridBagConstraints();
		gbc_sinb.fill = GridBagConstraints.BOTH;
		gbc_sinb.insets = new Insets(0, 0, 5, 5);
		gbc_sinb.gridx = 2;
		gbc_sinb.gridy = 2;
		jp.add(sinb, gbc_sinb);
		
		x2b = new JButton("x\u00B2");
		x2b.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_x2b = new GridBagConstraints();
		gbc_x2b.fill = GridBagConstraints.BOTH;
		gbc_x2b.insets = new Insets(0, 0, 5, 5);
		gbc_x2b.gridx = 3;
		gbc_x2b.gridy = 2;
		jp.add(x2b, gbc_x2b);
		
		nib = new JButton("n!");
		nib.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_nib = new GridBagConstraints();
		gbc_nib.fill = GridBagConstraints.BOTH;
		gbc_nib.insets = new Insets(0, 0, 5, 5);
		gbc_nib.gridx = 4;
		gbc_nib.gridy = 2;
		jp.add(nib, gbc_nib);
		
		dmsb = new JButton("dms");
		dmsb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_dmsb = new GridBagConstraints();
		gbc_dmsb.fill = GridBagConstraints.BOTH;
		gbc_dmsb.insets = new Insets(0, 0, 5, 5);
		gbc_dmsb.gridx = 0;
		gbc_dmsb.gridy = 3;
		jp.add(dmsb, gbc_dmsb);
		
		coshb = new JButton("cosh");
		coshb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_coshb = new GridBagConstraints();
		gbc_coshb.fill = GridBagConstraints.BOTH;
		gbc_coshb.insets = new Insets(0, 0, 5, 5);
		gbc_coshb.gridx = 1;
		gbc_coshb.gridy = 3;
		jp.add(coshb, gbc_coshb);
		
		cosb = new JButton("cos");
		cosb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_cosb = new GridBagConstraints();
		gbc_cosb.fill = GridBagConstraints.BOTH;
		gbc_cosb.insets = new Insets(0, 0, 5, 5);
		gbc_cosb.gridx = 2;
		gbc_cosb.gridy = 3;
		jp.add(cosb, gbc_cosb);
		
		xtopowyb = new JButton("x^y");
		xtopowyb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_xtopowyb = new GridBagConstraints();
		gbc_xtopowyb.fill = GridBagConstraints.BOTH;
		gbc_xtopowyb.insets = new Insets(0, 0, 5, 5);
		gbc_xtopowyb.gridx = 3;
		gbc_xtopowyb.gridy = 3;
		jp.add(xtopowyb, gbc_xtopowyb);
		
		yrootxb = new JButton("y\u221Ax");
		yrootxb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_yrootxb = new GridBagConstraints();
		gbc_yrootxb.fill = GridBagConstraints.BOTH;
		gbc_yrootxb.insets = new Insets(0, 0, 5, 5);
		gbc_yrootxb.gridx = 4;
		gbc_yrootxb.gridy = 3;
		jp.add(yrootxb, gbc_yrootxb);
		
		pib = new JButton("\u03C0");
		pib.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		GridBagConstraints gbc_pib = new GridBagConstraints();
		gbc_pib.fill = GridBagConstraints.BOTH;
		gbc_pib.insets = new Insets(0, 0, 5, 5);
		gbc_pib.gridx = 0;
		gbc_pib.gridy = 4;
		jp.add(pib, gbc_pib);
		
		tanhb = new JButton("tanh");
		tanhb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_tanhb = new GridBagConstraints();
		gbc_tanhb.fill = GridBagConstraints.BOTH;
		gbc_tanhb.insets = new Insets(0, 0, 5, 5);
		gbc_tanhb.gridx = 1;
		gbc_tanhb.gridy = 4;
		jp.add(tanhb, gbc_tanhb);
		
		tanb = new JButton("tan");
		tanb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_tanb = new GridBagConstraints();
		gbc_tanb.fill = GridBagConstraints.BOTH;
		gbc_tanb.insets = new Insets(0, 0, 5, 5);
		gbc_tanb.gridx = 2;
		gbc_tanb.gridy = 4;
		jp.add(tanb, gbc_tanb);
		
		x3b = new JButton("x\u00B3");
		x3b.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_x3b = new GridBagConstraints();
		gbc_x3b.fill = GridBagConstraints.BOTH;
		gbc_x3b.insets = new Insets(0, 0, 5, 5);
		gbc_x3b.gridx = 3;
		gbc_x3b.gridy = 4;
		jp.add(x3b, gbc_x3b);
		
		thirdrootxb = new JButton("\u221Bx");
		thirdrootxb.setFont(new Font("Serif", Font.PLAIN, 15));
		GridBagConstraints gbc_thirdrootxb = new GridBagConstraints();
		gbc_thirdrootxb.fill = GridBagConstraints.BOTH;
		gbc_thirdrootxb.insets = new Insets(0, 0, 5, 5);
		gbc_thirdrootxb.gridx = 4;
		gbc_thirdrootxb.gridy = 4;
		jp.add(thirdrootxb, gbc_thirdrootxb);
		
		feb = new JButton("F-E");
		feb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_feb = new GridBagConstraints();
		gbc_feb.fill = GridBagConstraints.BOTH;
		gbc_feb.insets = new Insets(0, 0, 9, 5);
		gbc_feb.gridx = 0;
		gbc_feb.gridy = 5;
		jp.add(feb, gbc_feb);
		
		expb = new JButton("Exp");
		expb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_expb = new GridBagConstraints();
		gbc_expb.fill = GridBagConstraints.BOTH;
		gbc_expb.insets = new Insets(0, 0, 9, 5);
		gbc_expb.gridx = 1;
		gbc_expb.gridy = 5;
		jp.add(expb, gbc_expb);
		
		modb = new JButton("Mod");
		modb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_modb = new GridBagConstraints();
		gbc_modb.fill = GridBagConstraints.BOTH;
		gbc_modb.insets = new Insets(0, 0, 9, 5);
		gbc_modb.gridx = 2;
		gbc_modb.gridy = 5;
		jp.add(modb, gbc_modb);
		
		
		logb = new JButton("log");
		logb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_logb = new GridBagConstraints();
		gbc_logb.fill = GridBagConstraints.BOTH;
		gbc_logb.insets = new Insets(0, 0, 9, 5);
		gbc_logb.gridx = 3;
		gbc_logb.gridy = 5;
		jp.add(logb, gbc_logb);
		
		tentopownb = new JButton("10\u207F");
		tentopownb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_tentopownb = new GridBagConstraints();
		gbc_tentopownb.insets = new Insets(0, 0, 9, 5);
		gbc_tentopownb.fill = GridBagConstraints.BOTH;
		gbc_tentopownb.gridx = 4;
		gbc_tentopownb.gridy = 5;
		jp.add(tentopownb, gbc_tentopownb);
		
		super.jf.getContentPane().setVisible(false);
		super.jf.getContentPane().setVisible(true);
	}
	

	public void entry() {
		
	}
}
