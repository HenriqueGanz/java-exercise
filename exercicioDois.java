import javax.swing.*;

public class exercicioDois {
    public static void main ( String entrada[] ) {

        int n1, n2, p = 1;

        char op = 0;
        String msg = "", msgEntr = "Digite 1 para calcular o produto dos numeros\nDigite 2 para calcular a produtoria \n";
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite aqui um numero inteiro"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo numero inteiro"));

        op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);

        switch (op) {
            case '1' : {
                if ( n1 > 0 && n2 > 0) {
                    JOptionPane.showMessageDialog(null,msg + "O produto dos dois numeros e = " + (n1*n2) );
                } else {
                    JOptionPane.showMessageDialog(null, "Os numeros nao sao positivos");
                }
            } break;
            case '2' : {
                for (int i=1; i<=n2; i=i+1) {
                    p = p * n1;
                }
                JOptionPane.showMessageDialog(null,msg + "O produtoria de " + n1 + ", " + n2 + " vezes eh: " + p + "\n" );

            } break;
            default: JOptionPane.showMessageDialog(null,"Opcao invalida, calculos nao realizados");
        }
    }
}
