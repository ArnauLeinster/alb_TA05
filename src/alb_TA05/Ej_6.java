package alb_TA05;

import javax.swing.JOptionPane;

public class Ej_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String preuS = JOptionPane.showInputDialog("Introduce el precio");
		double preuI = Integer.parseInt(preuS);
		final double iva = 0.21;
		double resul = preuI * iva + preuI;
		JOptionPane.showMessageDialog(null, resul + " es el precio final");
	}

}
