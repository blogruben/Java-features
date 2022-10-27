package VentanaDialogo;

import javax.swing.JOptionPane;

public class Main {
	
  public static void main (String[] args) {
    
    String nombre = JOptionPane.showInputDialog("Como te llamas?");
    JOptionPane.showMessageDialog(null,  "Hola " + nombre + " !!!");
    System.exit(0);
  }
}