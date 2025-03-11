import javax.swing.*;
public class ex7 {
    public static void main(String[] args ){
        float num = Float.parseFloat(JOptionPane.showInputDialog("Digite um número: "));
        String terca = String.format(" %.2f",num/3);
        JOptionPane.showMessageDialog(null, "O dobro é: " + num*2 + " e a terça parte é: " + terca);
    }
}
