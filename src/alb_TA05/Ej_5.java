package alb_TA05;

import javax.swing.JOptionPane;

public class Ej_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numS = JOptionPane.showInputDialog("Introduce el numer que quieres comprovar");
		double numI = Integer.parseInt(numS);
		if (numI % 2 != 0) {
			JOptionPane.showMessageDialog(null, numS + " no es divisible entre 2");
		} else {
			JOptionPane.showMessageDialog(null, numS + " es divisible entre 2");
		}
	}

}
