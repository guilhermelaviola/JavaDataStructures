package com.java.data_structures.linear;

import java.awt.EventQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

public class SumAndSubtractArrays extends JFrame {

	public SumAndSubtractArrays() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jLabel1 = new JLabel();
		input1 = new JTextField();
		jLabel2 = new JLabel();
		input2 = new JTextField();
		output = new JTextField();
		jLabel3 = new JLabel();
		clear = new JButton();
		jButton2 = new JButton();
		jButton3 = new JButton();

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setText("Array 1");

		jLabel2.setText("Array 2");

		jLabel3.setText("Result");

		clear.setText("clear");
		clear.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				clearActionPerformed(evt);
			}
		});

		jButton2.setText("Sum");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setText("Subtract");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup().addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(clear).addGap(153, 153, 153))
				.addGroup(layout.createSequentialGroup().addGap(20, 20, 20).addGroup(layout
						.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addComponent(jButton2)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(jButton3).addGap(97, 97, 97))
						.addGroup(layout.createSequentialGroup().addComponent(jLabel1).addGap(32, 32, 32)
								.addComponent(input1))
						.addGroup(layout.createSequentialGroup().addComponent(jLabel2).addGap(32, 32, 32)
								.addComponent(input2, GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE))
						.addGroup(layout.createSequentialGroup().addComponent(jLabel3).addGap(32, 32, 32)
								.addComponent(output, GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)))
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel1).addComponent(
						input1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel2).addComponent(
						input2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(37, 37, 37)
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jButton2)
						.addComponent(jButton3))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel3).addComponent(
						output, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(36, 36, 36).addComponent(clear).addContainerGap()));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void clearActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_clearActionPerformed
		input1.setText("");
		input2.setText("");
		output.setText("");
	}// GEN-LAST:event_clearActionPerformed

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
		String temp = input1.getText();
		String[] temp1 = temp.split("\\s+");
		a1 = new double[temp1.length];
		a2 = new double[temp1.length];
		res = new double[temp1.length];

		for (int i = 0; i < a1.length; i++) {
			a1[i] = Double.parseDouble(temp1[i]);
		}

		temp = input2.getText();
		temp1 = temp.split("\\s+");

		for (int i = 0; i < a1.length; i++) {
			a2[i] = Double.parseDouble(temp1[i]);
		}

		sumArray(a1, a2, res);
		temp = "";

		for (int i = 0; i < a1.length; i++) {
			temp += String.valueOf(res[i]) + " ";
		}
		output.setText(temp);

	}// GEN-LAST:event_jButton2ActionPerformed

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
		String temp = input1.getText();
		String[] temp1 = temp.split("\\s+");
		a1 = new double[temp1.length];
		a2 = new double[temp1.length];
		res = new double[temp1.length];

		for (int i = 0; i < a1.length; i++) {
			a1[i] = Double.parseDouble(temp1[i]);
		}

		temp = input2.getText();
		temp1 = temp.split("\\s+");

		for (int i = 0; i < a1.length; i++) {
			a2[i] = Double.parseDouble(temp1[i]);
		}

		subtraictArray(a1, a2, res);
		temp = "";
		for (int i = 0; i < a1.length; i++) {
			temp += String.valueOf(res[i]) + " ";
		}
		output.setText(temp);
	}// GEN-LAST:event_jButton3ActionPerformed

	double[] a1;
	double[] a2;
	double[] res;

	public void sumArray(double[] a1, double[] a2, double[] res) {
		for (int i = 0; i < a1.length; i++) {
			res[i] = a1[i] + a2[i];
		}
	}

	public void subtraictArray(double[] a1, double[] a2, double[] res) {
		for (int i = 0; i < a1.length; i++) {
			res[i] = a1[i] - a2[i];
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(SumAndSubtractArrays.class.getName()).log(Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			Logger.getLogger(SumAndSubtractArrays.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			Logger.getLogger(SumAndSubtractArrays.class.getName()).log(Level.SEVERE, null, ex);
		} catch (UnsupportedLookAndFeelException ex) {
			Logger.getLogger(SumAndSubtractArrays.class.getName()).log(Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new SumAndSubtractArrays().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private JTextField input1;
	private JTextField input2;
	private JButton jButton2;
	private JButton jButton3;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JButton clear;
	private JTextField output;
	// End of variables declaration//GEN-END:variables
}
