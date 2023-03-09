package alb_TA05;

import javax.swing.JOptionPane;

public class Ej_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ventaS = JOptionPane.showInputDialog("Introduce el las ventas a introducir");
		int ventaI = Integer.parseInt(ventaS);
		int resul = 0;
		for (int i = 0; i < ventaI; i++) {
			String venS = JOptionPane.showInputDialog("Introduce el las ventas completadas para la venta " + i);
			int venI = Integer.parseInt(venS);
			resul = resul + venI;
		}
		JOptionPane.showMessageDialog(null, "Numero total de ventas: " + resul);
	}

}
