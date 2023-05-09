import javax.swing.*;

public class exercicioTres {
    public static void soma (int vet[]) {
        int s=0;

        for(int i = 0; i < vet.length; i++) {
            s = s + vet[i];
        }
        JOptionPane.showMessageDialog(null, "A somatoria e " + s);
    }

    public static int produto(int vet[]) {
        int p=1;

        for (int i = 0;  i < vet.length; i++ ) {
            p = p * vet[i];
        }
        return p;
    }

    public static void main (String entrada[]) {
        int s=0, vetor[] = {1, 2, 3, 4, 5};
        int r;
        soma(vetor);
        r = produto(vetor);
        JOptionPane.showMessageDialog(null, "A produtoria e " + r);
        System.exit(0);
    }
}
