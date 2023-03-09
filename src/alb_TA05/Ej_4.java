package alb_TA05;

import javax.swing.JOptionPane;

public class Ej_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String radS = JOptionPane.showInputDialog("Introduce el radio");
		double radI = Integer.parseInt(radS);
		final double pi = 3.14;
		double resul = pi * Math.pow(radI, 2);
		JOptionPane.showMessageDialog(null, resul);
	}
}
