package alb_TA05;

import javax.swing.JOptionPane;

public class Ej_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String contra = "123";
		boolean cierto = false;
		int intentos = 0;
		while (intentos < 3 && cierto == false) {
			String ventaS = JOptionPane.showInputDialog("Introduzca la contraseña, este es el intento " + (intentos + 1) + " de 3");
			intentos++;
			if (contra.equals(ventaS)) {
				cierto = true;
			}
		}
		if (cierto) {
			JOptionPane.showMessageDialog(null, "Contraseña correcta");
		}else {
			JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
		}

	}

}
