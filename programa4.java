import javax.swing.*;
public class programa4 {
    public static void main (String entrada[]) {
        int n1, n2, div;

        double pot;

        String msg = "";

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Escolha um numero para dividir"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));

        div = (int)n1 / (int)n2;
        pot = Math.pow(n1, n2);

        msg = "O resultado da divisao dos numero e: " + div + "\n";
        msg = msg + "O resultado da potencia de " + n1 + " por " + n2 + " e igual a " + pot;

        JOptionPane.showMessageDialog(null, msg);
        System.exit(0);

    }
}
