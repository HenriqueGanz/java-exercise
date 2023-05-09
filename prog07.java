import javax.swing.*;

public class prog07 {
    public static void soma () {
        int s=0, vet[] = {1, 2, 3, 4, 5};

        for (int i = 0; i<vet.length; i++) {
            s = s + vet[i];
        }
        JOptionPane.showMessageDialog(null, "A somatoria e " + s);
    }

    public static int produto () {
        int p =1, vet[] = {1, 2, 3, 4, 5};

        for ( int i = 0; i<vet.length; i++) {
            p = p * vet[i];
        }
        return p;
    }

    public static void main (String entrada[]) {
        int r = produto();
        soma();
        JOptionPane.showMessageDialog(null, "A produtoria e " + r);
        System.exit(0);
    }
}
