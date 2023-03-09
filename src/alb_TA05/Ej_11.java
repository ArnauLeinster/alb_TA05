package alb_TA05;

import javax.swing.JOptionPane;

public class Ej_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dia = JOptionPane.showInputDialog("Introduce el dia actual");
		switch (dia.toLowerCase()) {
		case "lunes":
			JOptionPane.showMessageDialog(null, "El " + dia + " és dia laboral");
			break;
		case "martes":
			JOptionPane.showMessageDialog(null, "El " + dia + " és dia laboral");
			break;
		case "miércoles":
			JOptionPane.showMessageDialog(null, "El " + dia + " és dia laboral");
			break;
		case "jueves":
			JOptionPane.showMessageDialog(null, "El " + dia + " és dia laboral");
			break;
		case "viernes":
			JOptionPane.showMessageDialog(null, "El " + dia + " és dia laboral");
			break;
		case "sábado":
			JOptionPane.showMessageDialog(null, "El " + dia + " no és dia laboral");
			break;
		case "domingo":
			JOptionPane.showMessageDialog(null, "El " + dia + " no és dia laboral");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Has introducido incorrectamente el dia");
			break;
		}
	}

}
