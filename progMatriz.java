import javax.swing.*;

public class progMatriz {
    public static void main (String entrada[]){
        int vetor [] = {2, 4, 6, 8, 10};
        int matriz[][] = new int [2][3]; //matriz declarada com dois cochetes para representar 2 dimensoes, instanciar e definir quantas linhas e quantas colunas
        String msg = "vetor = ";

        for ( int i = 0; i< vetor.length ; i++) {
            msg = msg + vetor[i] + " ";
        }
        JOptionPane.showMessageDialog(null, msg);

        msg = "Matriz = \n\n";
        for (int i = 0 ; i < matriz.length ; i++) {
            for (int j = 0 ; j < matriz[0].length ;  j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um inteiro para posicao " + i + " e " + j));
                msg = msg + matriz[i][j] + " ";
            }
            msg = msg + "\n";
        }

        JOptionPane.showMessageDialog(null, msg);
        System.exit(0);
    }
}
