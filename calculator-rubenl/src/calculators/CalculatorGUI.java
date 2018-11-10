package calculators;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CalculatorGUI {
	JFrame jf;
	GridBagLayout gbl;
	JTextField textf;
	JButton memoryrecallb;
	JButton memoryclearb;
	JButton memorystoreb;
	JButton memoryaddb;
	JButton memorysubb;
	JButton backb;
	JButton cleareverythingb;
	JButton clearb;
	JButton plusminusb;
	JButton squarerootb;
	JButton sevenb;
	JButton eightb;
	JButton nineb;
	JButton divideb;
	JButton percentb;
	JButton fourb;
	JButton fiveb;
	JButton sixb;
	JButton multiplyb;
	JButton oneDivByXb;
	JButton oneb;
	JButton twob;
	JButton threeb;
	JButton minusb;
	JButton zerob;
	JButton commab;
	JButton plusb;
	JButton equalsb;
	
	public CalculatorGUI() {
		jf = new JFrame();
		jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setSize(395, 391);
		jf.setLocationRelativeTo(null);
		
		gbl = new GridBagLayout();
		gbl.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		gbl.rowHeights = new int[] {0, 50, 56, 40, 40, 40, 40, 40, 40};
		gbl.columnWidths = new int[] {0, 75, 75, 75, 75, 75};
		gbl.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		jf.getContentPane().setLayout(gbl);
		
		textf = new JTextField();
		textf.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textf.setHorizontalAlignment(SwingConstants.TRAILING);
		GridBagConstraints gbc_textf = new GridBagConstraints();
		gbc_textf.gridwidth = 5;
		gbc_textf.insets = new Insets(0, 0, 5, 5);
		gbc_textf.fill = GridBagConstraints.BOTH;
		gbc_textf.gridx = 1;
		gbc_textf.gridy = 1;
		jf.getContentPane().add(textf, gbc_textf);
		textf.setColumns(10);
		
		memoryclearb = new JButton("MC");
		memoryclearb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_memoryclearb = new GridBagConstraints();
		gbc_memoryclearb.fill = GridBagConstraints.BOTH;
		gbc_memoryclearb.insets = new Insets(0, 0, 5, 5);
		gbc_memoryclearb.gridx = 1;
		gbc_memoryclearb.gridy = 3;
		jf.getContentPane().add(memoryclearb, gbc_memoryclearb);
		
		memoryrecallb = new JButton("MR");
		memoryrecallb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_memoryrecallb = new GridBagConstraints();
		gbc_memoryrecallb.fill = GridBagConstraints.BOTH;
		gbc_memoryrecallb.insets = new Insets(0, 0, 5, 5);
		gbc_memoryrecallb.gridx = 2;
		gbc_memoryrecallb.gridy = 3;
		jf.getContentPane().add(memoryrecallb, gbc_memoryrecallb);
		
		memorystoreb = new JButton("MS");
		memorystoreb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_memorystoreb = new GridBagConstraints();
		gbc_memorystoreb.fill = GridBagConstraints.BOTH;
		gbc_memorystoreb.insets = new Insets(0, 0, 5, 5);
		gbc_memorystoreb.gridx = 3;
		gbc_memorystoreb.gridy = 3;
		jf.getContentPane().add(memorystoreb, gbc_memorystoreb);
		
		memoryaddb = new JButton("M+");
		memoryaddb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_memoryaddb = new GridBagConstraints();
		gbc_memoryaddb.fill = GridBagConstraints.BOTH;
		gbc_memoryaddb.insets = new Insets(0, 0, 5, 5);
		gbc_memoryaddb.gridx = 4;
		gbc_memoryaddb.gridy = 3;
		jf.getContentPane().add(memoryaddb, gbc_memoryaddb);
		
		memorysubb = new JButton("M-");
		memorysubb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_memorysubb = new GridBagConstraints();
		gbc_memorysubb.fill = GridBagConstraints.BOTH;
		gbc_memorysubb.insets = new Insets(0, 0, 5, 5);
		gbc_memorysubb.gridx = 5;
		gbc_memorysubb.gridy = 3;
		jf.getContentPane().add(memorysubb, gbc_memorysubb);
		
		backb = new JButton("\u2190");
		backb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_backb = new GridBagConstraints();
		gbc_backb.fill = GridBagConstraints.BOTH;
		gbc_backb.insets = new Insets(0, 0, 5, 5);
		gbc_backb.gridx = 1;
		gbc_backb.gridy = 4;
		jf.getContentPane().add(backb, gbc_backb);
		
		cleareverythingb = new JButton("CE");
		cleareverythingb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_cleareverythingb = new GridBagConstraints();
		gbc_cleareverythingb.fill = GridBagConstraints.BOTH;
		gbc_cleareverythingb.insets = new Insets(0, 0, 5, 5);
		gbc_cleareverythingb.gridx = 2;
		gbc_cleareverythingb.gridy = 4;
		jf.getContentPane().add(cleareverythingb, gbc_cleareverythingb);
		
		clearb = new JButton("C");
		clearb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_clearb = new GridBagConstraints();
		gbc_clearb.fill = GridBagConstraints.BOTH;
		gbc_clearb.insets = new Insets(0, 0, 5, 5);
		gbc_clearb.gridx = 3;
		gbc_clearb.gridy = 4;
		jf.getContentPane().add(clearb, gbc_clearb);
		
		plusminusb = new JButton("\u00B1");
		plusminusb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_plusminusb = new GridBagConstraints();
		gbc_plusminusb.fill = GridBagConstraints.BOTH;
		gbc_plusminusb.insets = new Insets(0, 0, 5, 5);
		gbc_plusminusb.gridx = 4;
		gbc_plusminusb.gridy = 4;
		jf.getContentPane().add(plusminusb, gbc_plusminusb);
		
		squarerootb = new JButton("\u221A");
		squarerootb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_squarerootb = new GridBagConstraints();
		gbc_squarerootb.fill = GridBagConstraints.BOTH;
		gbc_squarerootb.insets = new Insets(0, 0, 5, 5);
		gbc_squarerootb.gridx = 5;
		gbc_squarerootb.gridy = 4;
		jf.getContentPane().add(squarerootb, gbc_squarerootb);
		
		sevenb = new JButton("7");
		sevenb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_sevenb = new GridBagConstraints();
		gbc_sevenb.fill = GridBagConstraints.BOTH;
		gbc_sevenb.insets = new Insets(0, 0, 5, 5);
		gbc_sevenb.gridx = 1;
		gbc_sevenb.gridy = 5;
		jf.getContentPane().add(sevenb, gbc_sevenb);
		
		eightb = new JButton("8");
		eightb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_eightb = new GridBagConstraints();
		gbc_eightb.fill = GridBagConstraints.BOTH;
		gbc_eightb.insets = new Insets(0, 0, 5, 5);
		gbc_eightb.gridx = 2;
		gbc_eightb.gridy = 5;
		jf.getContentPane().add(eightb, gbc_eightb);
		
		nineb = new JButton("9");
		nineb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_nineb = new GridBagConstraints();
		gbc_nineb.fill = GridBagConstraints.BOTH;
		gbc_nineb.insets = new Insets(0, 0, 5, 5);
		gbc_nineb.gridx = 3;
		gbc_nineb.gridy = 5;
		jf.getContentPane().add(nineb, gbc_nineb);
		
		divideb = new JButton("/");
		divideb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_divideb = new GridBagConstraints();
		gbc_divideb.fill = GridBagConstraints.BOTH;
		gbc_divideb.insets = new Insets(0, 0, 5, 5);
		gbc_divideb.gridx = 4;
		gbc_divideb.gridy = 5;
		jf.getContentPane().add(divideb, gbc_divideb);
		
		percentb = new JButton("%");
		percentb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_percentb = new GridBagConstraints();
		gbc_percentb.fill = GridBagConstraints.BOTH;
		gbc_percentb.insets = new Insets(0, 0, 5, 5);
		gbc_percentb.gridx = 5;
		gbc_percentb.gridy = 5;
		jf.getContentPane().add(percentb, gbc_percentb);
		
		fourb = new JButton("4");
		fourb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_fourb = new GridBagConstraints();
		gbc_fourb.fill = GridBagConstraints.BOTH;
		gbc_fourb.insets = new Insets(0, 0, 5, 5);
		gbc_fourb.gridx = 1;
		gbc_fourb.gridy = 6;
		jf.getContentPane().add(fourb, gbc_fourb);
		
		fiveb = new JButton("5");
		fiveb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_fiveb = new GridBagConstraints();
		gbc_fiveb.fill = GridBagConstraints.BOTH;
		gbc_fiveb.insets = new Insets(0, 0, 5, 5);
		gbc_fiveb.gridx = 2;
		gbc_fiveb.gridy = 6;
		jf.getContentPane().add(fiveb, gbc_fiveb);
		
		sixb = new JButton("6");
		sixb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_sixb = new GridBagConstraints();
		gbc_sixb.fill = GridBagConstraints.BOTH;
		gbc_sixb.insets = new Insets(0, 0, 5, 5);
		gbc_sixb.gridx = 3;
		gbc_sixb.gridy = 6;
		jf.getContentPane().add(sixb, gbc_sixb);
		
		multiplyb = new JButton("*");
		multiplyb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_multiplyb = new GridBagConstraints();
		gbc_multiplyb.fill = GridBagConstraints.BOTH;
		gbc_multiplyb.insets = new Insets(0, 0, 5, 5);
		gbc_multiplyb.gridx = 4;
		gbc_multiplyb.gridy = 6;
		jf.getContentPane().add(multiplyb, gbc_multiplyb);
		
		oneDivByXb = new JButton("1/x");
		oneDivByXb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_oneDivByXb = new GridBagConstraints();
		gbc_oneDivByXb.fill = GridBagConstraints.BOTH;
		gbc_oneDivByXb.insets = new Insets(0, 0, 5, 5);
		gbc_oneDivByXb.gridx = 5;
		gbc_oneDivByXb.gridy = 6;
		jf.getContentPane().add(oneDivByXb, gbc_oneDivByXb);
		
		oneb = new JButton("1");
		oneb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_oneb = new GridBagConstraints();
		gbc_oneb.fill = GridBagConstraints.BOTH;
		gbc_oneb.insets = new Insets(0, 0, 5, 5);
		gbc_oneb.gridx = 1;
		gbc_oneb.gridy = 7;
		jf.getContentPane().add(oneb, gbc_oneb);
		
		twob = new JButton("2");
		twob.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_twob = new GridBagConstraints();
		gbc_twob.fill = GridBagConstraints.BOTH;
		gbc_twob.insets = new Insets(0, 0, 5, 5);
		gbc_twob.gridx = 2;
		gbc_twob.gridy = 7;
		jf.getContentPane().add(twob, gbc_twob);
		
		threeb = new JButton("3");
		threeb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_threeb = new GridBagConstraints();
		gbc_threeb.fill = GridBagConstraints.BOTH;
		gbc_threeb.insets = new Insets(0, 0, 5, 5);
		gbc_threeb.gridx = 3;
		gbc_threeb.gridy = 7;
		jf.getContentPane().add(threeb, gbc_threeb);
		
		minusb = new JButton("-");
		minusb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_minusb = new GridBagConstraints();
		gbc_minusb.fill = GridBagConstraints.BOTH;
		gbc_minusb.insets = new Insets(0, 0, 5, 5);
		gbc_minusb.gridx = 4;
		gbc_minusb.gridy = 7;
		jf.getContentPane().add(minusb, gbc_minusb);
		
		zerob = new JButton("0");
		zerob.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_zerob = new GridBagConstraints();
		gbc_zerob.fill = GridBagConstraints.BOTH;
		gbc_zerob.gridwidth = 2;
		gbc_zerob.insets = new Insets(0, 0, 5, 5);
		gbc_zerob.gridx = 1;
		gbc_zerob.gridy = 8;
		jf.getContentPane().add(zerob, gbc_zerob);
		
		commab = new JButton(",");
		commab.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_commab = new GridBagConstraints();
		gbc_commab.fill = GridBagConstraints.BOTH;
		gbc_commab.insets = new Insets(0, 0, 5, 5);
		gbc_commab.gridx = 3;
		gbc_commab.gridy = 8;
		jf.getContentPane().add(commab, gbc_commab);
		
		plusb = new JButton("+");
		plusb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_plusb = new GridBagConstraints();
		gbc_plusb.fill = GridBagConstraints.BOTH;
		gbc_plusb.insets = new Insets(0, 0, 5, 5);
		gbc_plusb.gridx = 4;
		gbc_plusb.gridy = 8;
		jf.getContentPane().add(plusb, gbc_plusb);
		
		equalsb = new JButton("=");
		equalsb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_equalsb = new GridBagConstraints();
		gbc_equalsb.insets = new Insets(0, 0, 5, 5);
		gbc_equalsb.fill = GridBagConstraints.BOTH;
		gbc_equalsb.gridheight = 2;
		gbc_equalsb.gridx = 5;
		gbc_equalsb.gridy = 7;
		jf.getContentPane().add(equalsb, gbc_equalsb);
		
		
		jf.setVisible(true);
	}
}
