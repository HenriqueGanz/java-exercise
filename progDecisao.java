import javax.swing.*;

public class progDecisao {
    public static void main (String entrada[]) {
        int num;
        char op=0;
        String msg = "";
        String msgEntr = "Digite 1 para par/impar\nDigite 2 para positivo/negativo";

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite aqui um numero inteiro"));
        op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);

        switch(op) {
            case '1' :
            {
                if(num % 2 == 0) {
                    msg = msg + num + " e par. \n";
                } else {
                    msg = msg + num + " e impar. \n";
                }
                break;
            }
            case '2' :
            {
                if(num > 0) {
                    msg = msg + num + " e positivo. \n";
                } else {
                    msg = msg + num + " e nao positivo. \n";
                }
                break;
            }
            default: JOptionPane.showMessageDialog(null, "Opcao invalida, calculos nao realizados");
        };

        if (op == '1' || op == '2') {
            JOptionPane.showMessageDialog(null, msg);
        }
        System.exit(0);
    }
}
