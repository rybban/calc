package calculators;

import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
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
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public SciCalculatorGUI() {
		
		super.jf.setSize(425, 391);

		super.jf.getContentPane().setLayout(new BorderLayout());
		
		
		super.jf.setSize(super.jf.getWidth()+400, super.jf.getHeight());
		super.jf.getContentPane().setSize(super.jf.getContentPane().getWidth()+400, super.jf.getContentPane().getHeight());
		
		jp = new JPanel();
		
		super.jf.getContentPane().setLocation(400, 0);
		super.jf.getContentPane().add(jp, BorderLayout.EAST);
		
		
		
		GridBagLayout gbl_jp = new GridBagLayout();
		gbl_jp.columnWidths = new int[] {75, 75, 75, 75, 75};
		gbl_jp.rowHeights = new int[] {40, 40, 40, 40, 40, 40};
		gbl_jp.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		gbl_jp.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		jp.setLayout(gbl_jp);
		
		String xraised = new String("x");
		
		
		JButton btnNewButton = new JButton("10" + "\u207F");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JRadioButton radioButton = new JRadioButton("1");
		GridBagConstraints gbc_radioButton = new GridBagConstraints();
		gbc_radioButton.insets = new Insets(0, 0, 5, 5);
		gbc_radioButton.gridx = 0;
		gbc_radioButton.gridy = 0;
		jp.add(radioButton, gbc_radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("2");
		GridBagConstraints gbc_radioButton_1 = new GridBagConstraints();
		gbc_radioButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_radioButton_1.gridx = 1;
		gbc_radioButton_1.gridy = 0;
		jp.add(radioButton_1, gbc_radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("3");
		GridBagConstraints gbc_radioButton_2 = new GridBagConstraints();
		gbc_radioButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_radioButton_2.gridx = 2;
		gbc_radioButton_2.gridy = 0;
		jp.add(radioButton_2, gbc_radioButton_2);
		
		JButton button_16 = new JButton("10\u207F");
		button_16.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_button_16 = new GridBagConstraints();
		gbc_button_16.fill = GridBagConstraints.BOTH;
		gbc_button_16.insets = new Insets(0, 0, 5, 5);
		gbc_button_16.gridx = 4;
		gbc_button_16.gridy = 1;
		jp.add(button_16, gbc_button_16);
		
		JButton button_15 = new JButton("10\u207F");
		button_15.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_button_15 = new GridBagConstraints();
		gbc_button_15.fill = GridBagConstraints.BOTH;
		gbc_button_15.insets = new Insets(0, 0, 5, 0);
		gbc_button_15.gridx = 5;
		gbc_button_15.gridy = 1;
		jp.add(button_15, gbc_button_15);
		
		JButton button_22 = new JButton("10\u207F");
		button_22.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_button_22 = new GridBagConstraints();
		gbc_button_22.fill = GridBagConstraints.BOTH;
		gbc_button_22.insets = new Insets(0, 0, 5, 5);
		gbc_button_22.gridx = 0;
		gbc_button_22.gridy = 2;
		jp.add(button_22, gbc_button_22);
		
		JButton button_21 = new JButton("10\u207F");
		button_21.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_button_21 = new GridBagConstraints();
		gbc_button_21.fill = GridBagConstraints.BOTH;
		gbc_button_21.insets = new Insets(0, 0, 5, 5);
		gbc_button_21.gridx = 1;
		gbc_button_21.gridy = 2;
		jp.add(button_21, gbc_button_21);
		
		JButton button_20 = new JButton("10\u207F");
		button_20.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_button_20 = new GridBagConstraints();
		gbc_button_20.fill = GridBagConstraints.BOTH;
		gbc_button_20.insets = new Insets(0, 0, 5, 5);
		gbc_button_20.gridx = 2;
		gbc_button_20.gridy = 2;
		jp.add(button_20, gbc_button_20);
		
		JButton button_17 = new JButton("10\u207F");
		button_17.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_button_17 = new GridBagConstraints();
		gbc_button_17.fill = GridBagConstraints.BOTH;
		gbc_button_17.insets = new Insets(0, 0, 5, 5);
		gbc_button_17.gridx = 3;
		gbc_button_17.gridy = 2;
		jp.add(button_17, gbc_button_17);
		
		JButton button_19 = new JButton("10\u207F");
		button_19.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_button_19 = new GridBagConstraints();
		gbc_button_19.fill = GridBagConstraints.BOTH;
		gbc_button_19.insets = new Insets(0, 0, 5, 5);
		gbc_button_19.gridx = 4;
		gbc_button_19.gridy = 2;
		jp.add(button_19, gbc_button_19);
		
		JButton button_14 = new JButton("10\u207F");
		button_14.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_button_14 = new GridBagConstraints();
		gbc_button_14.fill = GridBagConstraints.BOTH;
		gbc_button_14.insets = new Insets(0, 0, 5, 0);
		gbc_button_14.gridx = 5;
		gbc_button_14.gridy = 2;
		jp.add(button_14, gbc_button_14);
		
		JButton button_23 = new JButton("10\u207F");
		button_23.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_button_23 = new GridBagConstraints();
		gbc_button_23.fill = GridBagConstraints.BOTH;
		gbc_button_23.insets = new Insets(0, 0, 5, 5);
		gbc_button_23.gridx = 0;
		gbc_button_23.gridy = 3;
		jp.add(button_23, gbc_button_23);
		
		
		JButton btnNewButton_1 = new JButton("log");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 1;
		gbc_btnNewButton_1.gridy = 3;
		jp.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton button_18 = new JButton("10\u207F");
		button_18.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_button_18 = new GridBagConstraints();
		gbc_button_18.fill = GridBagConstraints.BOTH;
		gbc_button_18.insets = new Insets(0, 0, 5, 5);
		gbc_button_18.gridx = 2;
		gbc_button_18.gridy = 3;
		jp.add(button_18, gbc_button_18);
		
		JButton button_13 = new JButton("10\u207F");
		button_13.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_button_13 = new GridBagConstraints();
		gbc_button_13.fill = GridBagConstraints.BOTH;
		gbc_button_13.insets = new Insets(0, 0, 5, 5);
		gbc_button_13.gridx = 3;
		gbc_button_13.gridy = 3;
		jp.add(button_13, gbc_button_13);
		
		JButton button_12 = new JButton("10\u207F");
		button_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_button_12 = new GridBagConstraints();
		gbc_button_12.fill = GridBagConstraints.BOTH;
		gbc_button_12.insets = new Insets(0, 0, 5, 5);
		gbc_button_12.gridx = 4;
		gbc_button_12.gridy = 3;
		jp.add(button_12, gbc_button_12);
		
		JButton button_11 = new JButton("10\u207F");
		button_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_button_11 = new GridBagConstraints();
		gbc_button_11.fill = GridBagConstraints.BOTH;
		gbc_button_11.insets = new Insets(0, 0, 5, 0);
		gbc_button_11.gridx = 5;
		gbc_button_11.gridy = 3;
		jp.add(button_11, gbc_button_11);
		
		JButton button_10 = new JButton("10\u207F");
		button_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_button_10 = new GridBagConstraints();
		gbc_button_10.fill = GridBagConstraints.BOTH;
		gbc_button_10.insets = new Insets(0, 0, 5, 5);
		gbc_button_10.gridx = 0;
		gbc_button_10.gridy = 4;
		jp.add(button_10, gbc_button_10);
		
		JButton button_9 = new JButton("10\u207F");
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_button_9 = new GridBagConstraints();
		gbc_button_9.fill = GridBagConstraints.BOTH;
		gbc_button_9.insets = new Insets(0, 0, 5, 5);
		gbc_button_9.gridx = 1;
		gbc_button_9.gridy = 4;
		jp.add(button_9, gbc_button_9);
		
		JButton button_8 = new JButton("10\u207F");
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_button_8 = new GridBagConstraints();
		gbc_button_8.fill = GridBagConstraints.BOTH;
		gbc_button_8.insets = new Insets(0, 0, 5, 5);
		gbc_button_8.gridx = 2;
		gbc_button_8.gridy = 4;
		jp.add(button_8, gbc_button_8);
		
		JButton button_7 = new JButton("10\u207F");
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_button_7 = new GridBagConstraints();
		gbc_button_7.fill = GridBagConstraints.BOTH;
		gbc_button_7.insets = new Insets(0, 0, 5, 5);
		gbc_button_7.gridx = 3;
		gbc_button_7.gridy = 4;
		jp.add(button_7, gbc_button_7);
		
		JButton button_6 = new JButton("10\u207F");
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_button_6 = new GridBagConstraints();
		gbc_button_6.fill = GridBagConstraints.BOTH;
		gbc_button_6.insets = new Insets(0, 0, 5, 5);
		gbc_button_6.gridx = 4;
		gbc_button_6.gridy = 4;
		jp.add(button_6, gbc_button_6);
		
		JButton button_5 = new JButton("10\u207F");
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_button_5 = new GridBagConstraints();
		gbc_button_5.fill = GridBagConstraints.BOTH;
		gbc_button_5.insets = new Insets(0, 0, 5, 0);
		gbc_button_5.gridx = 5;
		gbc_button_5.gridy = 4;
		jp.add(button_5, gbc_button_5);
		
		JButton button_4 = new JButton("10\u207F");
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.fill = GridBagConstraints.BOTH;
		gbc_button_4.insets = new Insets(0, 0, 0, 5);
		gbc_button_4.gridx = 0;
		gbc_button_4.gridy = 5;
		jp.add(button_4, gbc_button_4);
		
		JButton button_3 = new JButton("10\u207F");
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.fill = GridBagConstraints.BOTH;
		gbc_button_3.insets = new Insets(0, 0, 0, 5);
		gbc_button_3.gridx = 1;
		gbc_button_3.gridy = 5;
		jp.add(button_3, gbc_button_3);
		
		JButton button_2 = new JButton("10\u207F");
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.fill = GridBagConstraints.BOTH;
		gbc_button_2.insets = new Insets(0, 0, 0, 5);
		gbc_button_2.gridx = 2;
		gbc_button_2.gridy = 5;
		jp.add(button_2, gbc_button_2);
		
		JButton button_1 = new JButton("10\u207F");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.fill = GridBagConstraints.BOTH;
		gbc_button_1.insets = new Insets(0, 0, 0, 5);
		gbc_button_1.gridx = 3;
		gbc_button_1.gridy = 5;
		jp.add(button_1, gbc_button_1);
		
		JButton button = new JButton("10\u207F");
		button.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.fill = GridBagConstraints.BOTH;
		gbc_button.insets = new Insets(0, 0, 0, 5);
		gbc_button.gridx = 4;
		gbc_button.gridy = 5;
		jp.add(button, gbc_button);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.VERTICAL;
		gbc_btnNewButton.gridx = 5;
		gbc_btnNewButton.gridy = 5;
		jp.add(btnNewButton, gbc_btnNewButton);
		
		super.jf.getContentPane().setVisible(false);
		super.jf.getContentPane().setVisible(true);
	}
	

	public void entry() {
		
	}
}
