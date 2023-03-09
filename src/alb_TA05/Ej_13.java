package alb_TA05;

import javax.swing.JOptionPane;

public class Ej_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1 = JOptionPane.showInputDialog("Introduce el primer numero");
		int n1 = Integer.parseInt(num1);
		String num2 = JOptionPane.showInputDialog("Introduce el segundo numero");
		int n2 = Integer.parseInt(num2);
		String oper = JOptionPane.showInputDialog("Introduce la operación deseada");
		switch (oper) {
		case "+":
			JOptionPane.showMessageDialog(null, n1 + (oper) + n2 + " = " + (n1 + n2));
			break;
		case "-":
			JOptionPane.showMessageDialog(null, n1 + (oper) + n2 + " = " + (n1 - n2));
			break;
		case "*":
			JOptionPane.showMessageDialog(null, n1 + (oper) + n2 + " = " + (n1 * n2));
			break;
		case "/":
			JOptionPane.showMessageDialog(null, n1 + (oper) + n2 + " = " + (n1 / n2));
			break;
		case "^":
			JOptionPane.showMessageDialog(null, n1 + (oper) + n2 + " = " + (Math.pow(n1, n2)));
			break;
		case "%":
			JOptionPane.showMessageDialog(null, n1 + (oper) + n2 + " = " + (n1 % n2));
			break;
		}
	}

}
