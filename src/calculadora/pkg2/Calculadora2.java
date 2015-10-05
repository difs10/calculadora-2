package calculadora.pkg2;

import javax.swing.JOptionPane;

public class Calculadora2 {

    public static void main(String[] args) {
        int a;
        do {
            a = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 si quiere sumar"
                    + "\n" + "Digite 2 si quiere restar"
                    + "\n" + "Digite 3 si quiere multiplicar"
                    + "\n" + "Digite 4 si quiere dividir"
                    + "\n" + "Digite 5 si quiere ver el numero mayor"
                    + "\n" + "Digite 6 si quiere sacar un porcentaje"
                    + "\n" + "Digite 7 si quiere Salir"));
            if (a >= 8 | a <= 0) {

                JOptionPane.showMessageDialog(null, "el numero ingresado no es correcto");

            }
            if (a == 1) {
                int x = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero"));
                int y = Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero"));

                int suma = x + y;
                JOptionPane.showMessageDialog(null, "La suma es: " + suma);

            }
            if (a == 2) {
                int x = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero"));
                int y = Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero"));

                int resta = x - y;
                JOptionPane.showMessageDialog(null, "La resta es: " + resta);

            }
            if (a == 3) {
                int x = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero"));
                int y = Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero"));

                int multiplicacion = x * y;
                JOptionPane.showMessageDialog(null, "La multiplicacion es: " + multiplicacion);

            }
            if (a == 4) {
                int x = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero"));
                int y = Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero"));

                int division = x / y;
                JOptionPane.showMessageDialog(null, "La division es: " + division);

            }
            if (a == 5) {
                int x = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer número"));
                int y = Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo número"));

                if (x > y) {
                    JOptionPane.showMessageDialog(null, "el numero mayor es: " + x);
                } else {
                    JOptionPane.showMessageDialog(null, "el numero mayor es: " + y);
                }

            }
            if (a == 6) {
                int x = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer número"));
                int y = Integer.parseInt(JOptionPane.showInputDialog("ingrese el porcentaje que desea sacar"));

                int porcentaje = x * y / 100;
                JOptionPane.showMessageDialog(null, "el porcentaje del numero es " + porcentaje);

            }

        } while (a < 7);
    }

}
